package com.company;

public final class Chick extends Cock {

    private String Speed;

    public Chick(String name, String type, int age, String security, String hardiness, Color color, String speed) {
        super(name, type, age, security, hardiness, color);
        Speed = speed;
    }


    public Chick(String name, String type, int age, String speed) {
        super(name, type, age);
        Speed = speed;
    }

    public Chick(String name, String type, int age) {
        super(name, type, age);
    }


    public void useHardiness() {
        System.out.println("superHardiness");
    }
    public String getInfo() {
        return " Имя :" + getName() +
                " Порода: " + getType() +
                " Возраст: " + getAge() +
                " Цвет: " + Color.PINK;
    }

}
