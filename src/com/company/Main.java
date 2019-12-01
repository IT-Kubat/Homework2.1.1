package com.company;

public class Main {

    public static void main(String[] args) {

        Cock cock = new Cock("Koroz", "Broiler", 5);
        cock.useHardiness();
        System.out.println(cock);
        System.out.println(cock.getInfo());


        Chick chick = new Chick("Tsyplenok", "Indeyka", 1,"nimble", "fast", Color.WHITE, "medium");
        chick.useHardiness();
        System.out.println(chick);
        System.out.println(chick.getInfo());

        Chick chick1 = new Chick("Zhozho", "Mestnyi", 1, "low");
        chick1.useHardiness();
        System.out.println(chick1);
        System.out.println(chick1.getInfo());


    }

}

