package com.example.herencia;

public class Start {
    public static void main(String[] args) {
        Conveyance avion = new Conveyance("Avion", false, "avianca es mio");
        avion.description = "avianca es mio X2";
        System.out.println(avion.getDescription());

        Vehicle bike = new Vehicle("Bicicleta", true, "Bicicleta de mi papa", "TREK", 2600000);
        Vehicle car = new Vehicle("Carro", false, "El que me lleva", "Chevrolet", 33000000);
        bike.run();
        car.run();
        car.grease();
    }
}
