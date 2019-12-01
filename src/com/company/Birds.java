package com.company;

public class Birds {

    private    String name;
    private String type;
    private int age;
    private String color;

    public Birds(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public Birds(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
    public String getInfo(){
        return "Имя:" + getName() +
                "Порода:" + getType() +
                "Цвет"+ getColor() +
                "Возраст:" + getAge();

    }



}
