package com.herya.services;

import com.herya.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class CustomerServicesImpl implements CustomerService{
    public CustomerDto getCustomerById(UUID customerId){
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("herya")
                .build();
    }
}

