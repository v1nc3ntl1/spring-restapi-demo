package com.employee.restapi2;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(long id) {
        super("Could not find order " + id);

    }
}
