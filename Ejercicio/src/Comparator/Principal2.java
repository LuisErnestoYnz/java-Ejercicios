package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        // definir la lista de empleados
        List<Empleado> listaEmpleados = new ArrayList<>();

        // agregar elementos (empleados) a la lista
        listaEmpleados.add(new Empleado("Luis", 32, 18.00));
        listaEmpleados.add(new Empleado("Diana", 30, 15.00));
        listaEmpleados.add(new Empleado("Ale", 40, 12.00));
        listaEmpleados.add(new Empleado("Juan", 28, 14.00));
        listaEmpleados.add(new Empleado("Martin", 33, 19.00));

        // ordenar la lista de empleados. en sort pasar: la lista de empleados, un objeto de la clase ComparatorNombre
        // el cual es la clase que implementa la interfaz comparator
        // y que sobreescribie al metodo compare
        System.out.println("Ordenar elementos por nombre de empleado");
        Collections.sort(listaEmpleados, new ComparatorNombre());

        // iterar la lista para mostrar los empleados ordenados
        for(Empleado e: listaEmpleados){
            System.out.println(e);
        }

        System.out.println("Ordenar elementos por nombre de edad");
        Collections.sort(listaEmpleados, new ComparatorEdad());

        // iterar la lista para mostrar los empleados ordenados por edad
        for(Empleado e: listaEmpleados){
            System.out.println(e);
        }

        System.out.println("Ordenar elementos por sueldo");
        Collections.sort(listaEmpleados, new ComparatorSueldo());

        // iterar la lista para mostrar los empleados ordenados por edad
        for(Empleado e: listaEmpleados){
            System.out.println(e);
        }
    }
}
