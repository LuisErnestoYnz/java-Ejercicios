package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal5 {
    public static void main(String[] args) {
        // definir la lista de empleados
        List<Empleado> listaEmpleados = new ArrayList<>();

        // agregar elementos (empleados) a la lista
        listaEmpleados.add(new Empleado("Luis", 32, 18.00));
        listaEmpleados.add(new Empleado("Diana", 30, 15.00));
        listaEmpleados.add(new Empleado("Ale", 40, 12.00));
        listaEmpleados.add(new Empleado("Juan", 28, 14.00));
        listaEmpleados.add(new Empleado("Martin", 33, 19.00));

        // Definir una Clase Anonima de comparator
        Comparator<Empleado> compNombre = new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        };

        Comparator<Empleado> compEdad = new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return o1.getEdad() - o2.getEdad();
            }
        };

        Comparator<Empleado> compSueldo = new Comparator<Empleado>() {
            @Override
            public int compare(Empleado o1, Empleado o2) {
                return (int) (o1.getSueldo() - o2.getSueldo());
            }
        };

        // ordenar la lista de empleados. en sort pasar: la lista de empleados, un objeto de la clase Principal3
        // el cual es la clase que implementa la interfaz comparator
        // y que sobreescribie al metodo compare
        System.out.println("Ordenar elementos por nombre de empleado");
        Collections.sort(listaEmpleados, compNombre);

        // iterar la lista para mostrar los empleados ordenados
        for(Empleado e: listaEmpleados){
            System.out.println(e);
        }

        System.out.println("Ordenar elementos por edad de empleado");
        Collections.sort(listaEmpleados, compEdad);

        // iterar la lista para mostrar los empleados ordenados
        for(Empleado e: listaEmpleados){
            System.out.println(e);
        }

        System.out.println("Ordenar elementos por sueldo de empleado");
        Collections.sort(listaEmpleados, compSueldo);

        // iterar la lista para mostrar los empleados ordenados
        for(Empleado e: listaEmpleados){
            System.out.println(e);
        }
    }
}
