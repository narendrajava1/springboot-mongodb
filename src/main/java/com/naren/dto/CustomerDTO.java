package com.naren.dto;
import com.naren.model.Customer;

public record CustomerDTO(String gender, int age, String email, int satisfaction) {
    public CustomerDTO(Customer c) {
        this(c.getGender(), c.getAge(), c.getEmail(), c.getSatisfaction());
    }

    public Customer toCustomer() {
        return new Customer(gender, age, email, satisfaction);
    }
}

