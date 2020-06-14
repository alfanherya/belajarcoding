package com.herya.web.controller;


import com.herya.services.BeerServices;
import com.herya.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerServices beerServices;

    public BeerController(BeerServices beerServices){
        this.beerServices = beerServices;
    }
    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId")UUID beerId){
        return new ResponseEntity<>(beerServices.getBeerById(beerId), HttpStatus.OK);
    }
    @PostMapping // ditambahkan post untuk membuat beer baru
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto){
        BeerDto savedDto = beerServices.saveNewBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("location", "/api/v1/beer/" + savedDto.getId().toString());

        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        beerServices.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
