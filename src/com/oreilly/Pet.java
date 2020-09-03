package com.oreilly;

public class Pet {

    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public void feed(){
        System.out.println("I'm feeding " + name);
    }

    public void feed(String food){

        System.out.println("I'm feeding "+ name + " some "+ food);

    }

    public String getName() {
        return name;
    }
}
