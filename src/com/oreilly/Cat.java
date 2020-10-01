package com.oreilly;

public class Cat extends Pet implements Furry {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("The Cat "+ getName() +" is demanding to be fed");
    }

    public void groom() {
        System.out.println("The Cat " + getName() + " grooms");
    }
}
