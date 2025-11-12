package Operaciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {
        // Array que almanena los objetos operaciones
        List<Operacion> arrayOperaciones = new ArrayList<>();

        // Agregamos las instancias de objetos que son Operaciones
        arrayOperaciones.add(new Suma(8, 5));
        arrayOperaciones.add(new Resta(8, 4));
        arrayOperaciones.add(new Multiplicacion(4, 9));
        arrayOperaciones.add(new Division(10, 2));

        // Iterar la lista para obtener cada objeto operacion y ejecutar su correspondiente operacion aritmetica
        for(Operacion op: arrayOperaciones) {
            System.out.println(op.toString());
            // Para cada objeto Operacion, se ejecuta su respectiva operacion aritmetica
            // Polimorfismo: la variable de ref. op toma diferentes formas del metodo ejecutaOperacion, corresp. a cada operacion aritmetica
            int resultado = op.ejecutaOperacion();
            System.out.println(resultado);
        }
    }
}
