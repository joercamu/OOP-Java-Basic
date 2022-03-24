package com.example.herencia;

import com.example.abstracto.ConveyanceMaintenance;

public class Conveyance extends ConveyanceMaintenance {
    private String name;
    private boolean environmentFriendly;
    protected String description;

    public Conveyance(String name, boolean environmentFriendly, String description) {
        this.name = name;
        this.environmentFriendly = environmentFriendly;
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public String GetInfoConveyance() {
        return String.format("nombre: {}, amigable: {}", this.name, this.environmentFriendly ? "SI" : "NO");
    }

    @Override
    public void grease() {
        System.out.println(String.format("%s engrasada!", getName()));
    }
}
