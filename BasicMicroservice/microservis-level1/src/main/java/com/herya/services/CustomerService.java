package com.herya.services;

import com.herya.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
CustomerDto getCustomerById(UUID customerId);
}
