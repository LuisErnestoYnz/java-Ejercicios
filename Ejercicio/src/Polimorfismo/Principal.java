package Polimorfismo;

import java.util.ArrayList;

public class Principal {
    static void main() {
        ArrayList<Operacion> operaciones = new ArrayList<>();

        //agregar las operaciones al arraylist
        operaciones.add(new Suma(8, 5));
        operaciones.add(new Resta(10, 5));
        operaciones.add(new Multiplicacion(2, 5));
        operaciones.add(new Division(25, 5));

        // iterar arraylist
        for (Operacion operacion : operaciones) {
            System.out.println(operacion);
            int op = operacion.ejecutarOperacion();
            System.out.println(op);
        }
    }
}
