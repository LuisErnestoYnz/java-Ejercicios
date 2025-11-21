package Comparator;

import java.util.*;

public class Principal {
    static void main() {
        // Se define la lista de empleados
        List<Empleado> listaEmpleados = new ArrayList<>();

        // Agregar empleados a la lista
        listaEmpleados.add(new Empleado("Miguel",28,18.25));
        listaEmpleados.add(new Empleado("Ana",25,23.25));
        listaEmpleados.add(new Empleado("Jorge",30,28.20));
        listaEmpleados.add(new Empleado("Leticia",32,15.50));
        listaEmpleados.add(new Empleado("Juan",28,17.00));

        // clase anonima para definir metodo compare, el cual ayuda a ordenar por nombre de empleado
        Comparator<Empleado> comparatorNombre = new Comparator<Empleado>() {
            @Override
            public int compare(Empleado e1, Empleado e2) {
                return e1.getNombre().compareTo(e2.getNombre());
            }
        };

        Comparator<Empleado> comparatorEdad = new Comparator<Empleado>() {
            @Override
            public int compare(Empleado e1, Empleado e2) {
                return e1.getEdad() - e2.getEdad();
            }
        };

        Comparator<Empleado> comparatorSueldo = new Comparator<Empleado>() {
            @Override
            public int compare(Empleado e1, Empleado e2) {
                return (int) (e1.getSueldo() - e2.getSueldo());
            }
        };

        // Ordenar elementos por nombre de empleado
        System.out.println("Ordenar elementos por nombre de empleado");
        Collections.sort(listaEmpleados, comparatorNombre);
        for(Empleado e: listaEmpleados) {
            System.out.println(e);
        }

        // Ordenar elementos por edad del empleado
        System.out.println("\nOrdenar elementos por edad del empleado");
        Collections.sort(listaEmpleados, comparatorEdad);
        for(Empleado e: listaEmpleados) {
            System.out.println(e);
        }

        // Ordenar elementos por sueldo del empleado
        System.out.println("\nOrdenar elementos por sueldo del empleado");
        Collections.sort(listaEmpleados, comparatorSueldo);
        for(Empleado e: listaEmpleados) {
            System.out.println(e);
        }
    }
}
