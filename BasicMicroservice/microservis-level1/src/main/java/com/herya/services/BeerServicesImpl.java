package com.herya.services;

import com.herya.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServicesImpl implements BeerServices {
    @Override

    public BeerDto getBeerById(UUID beerId){
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Xiaomi")
                .beerStyle("Android pie")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto){
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }
}
