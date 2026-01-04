package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Luis", 28));
        personas.add(new Persona("Ale", 22));
        personas.add(new Persona("Daniela", 26));

        Collections.sort(personas);

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
