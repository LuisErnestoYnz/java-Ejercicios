package Comparator;

import java.util.Comparator;

// esta clase implementa Comparator
public class ComparatorNombre implements Comparator<Empleado> {
    // sobreescribir el metodo compare()
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}

