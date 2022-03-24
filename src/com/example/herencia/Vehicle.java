package com.example.herencia;

import com.example.abstracto.ConveyanceMaintenance;

public class Vehicle extends Conveyance {


    private String mark;
    private float invoicePrice;

    public Vehicle(String name, Boolean environmentFriendly, String description, String mark, float invoicePrice) {
        super(name, environmentFriendly, description);
        this.mark = mark;
        this.invoicePrice = invoicePrice;

    }

    public String getMark() {
        return mark;
    }

    public float getInvoicePrice() {
        return invoicePrice;
    }

    public void run() {
        System.out.println(String.format("Andando en mi %s...", getName()));
    }
}
