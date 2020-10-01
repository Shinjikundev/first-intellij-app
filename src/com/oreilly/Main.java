package com.oreilly;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private void run() {
        Map<String, Integer> agesByPerson = new HashMap<>();
        agesByPerson.put("Ben", 42);
        agesByPerson.put("David", 19);
        agesByPerson.put("George", 57);

        System.out.println("George's age: " + agesByPerson.get("George"));

        /* This is valid until module 10
        Pet p = Pet.make("Jerry");
        Cat c = new Cat("Tom");
        System.out.println(p.getName());
        p.feed( "Cheese");
        c.feed();

        Furry f =c;
        f.groom();
        f = new Bear();
        f.groom();
        */
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.run();
    }
}


