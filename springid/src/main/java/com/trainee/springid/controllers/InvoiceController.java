package com.trainee.springid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.springid.models.Invoice;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @RequestMapping("/show")
    public Invoice show(){
        return invoice;
    }
}
