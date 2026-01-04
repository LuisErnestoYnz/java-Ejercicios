package Comparator;

import java.util.Comparator;

// esta clase implementa Comparator
public class ComparatorEdad implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        // sobreescribir el metodo compare()
        return o1.getEdad() - o2.getEdad();
    }
}
