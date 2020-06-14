package com.herya.services;

import com.herya.web.model.BeerDto;

import java.util.UUID;

public interface BeerServices {
    BeerDto getBeerById(UUID beerId);
}
