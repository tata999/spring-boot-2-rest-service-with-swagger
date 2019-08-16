package com.springboot.rest.swagger.task.invoice;

public class InvoiceNotFoundException extends RuntimeException {

    public InvoiceNotFoundException(String exception) {
        super(exception);
    }
}
