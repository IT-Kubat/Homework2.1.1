package com.company;

public class Cock extends Birds {

    private String Security;
    private String Hardiness;
    private Color color;

    public Cock(String name, String type, int age, String security, String hardiness, Color color) {
        super(name, type, age);
        Security = security;
        Hardiness = hardiness;
        this.color = color;
    }

    public Cock(String name, String type, int age) {
        super(name, type, age);

    }
    public void useHardiness(){
        System.out.println("Power");
    }
    public final void useHardiness(String hardiness , int count){
        for (int i = 0; i <count; i++) {
            System.out.println(hardiness);

        }

    }

    public String getInfo() {
        return " Имя: " + getName() +
                " Порода: " + getType() +
                " Возраст: " + getAge() +
                " Цвет: " + Color.BLACK;
    }
}
