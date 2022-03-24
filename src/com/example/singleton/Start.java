package com.example.singleton;

public class Start {
    // unique instance.
    static Config config = Config.getConfig(3102911,"T32");
    // duplicate instance error
    static Config config2 = Config.getConfig(0000,"T300");

    public static void main(String[] args) {
        // get data of instance
        String textOut = config2.getData();
        System.out.println(textOut);

    }
}
