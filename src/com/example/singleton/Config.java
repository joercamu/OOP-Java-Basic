package com.example.singleton;

public class Config {
    private int numberPhone;
    private String size;
    private static Config miconfig;

    private Config(int number, String size) {
        this.numberPhone = number;
        this.size = size;
    }

    public static Config getConfig(int number, String size) {
        if(miconfig == null ){
            miconfig = new Config(number,size);
        }
        return miconfig;
    }



    public String getData (){
        return "number "+ this.numberPhone+ ". size: "+this.size;
    }
}
