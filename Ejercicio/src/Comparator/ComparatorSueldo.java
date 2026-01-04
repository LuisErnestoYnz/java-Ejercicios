package Comparator;

import java.util.Comparator;

public class ComparatorSueldo implements Comparator<Empleado> {
    @Override
    public int compare(Empleado o1, Empleado o2) {
        // para hacer orden descendente, cambiar el orden de o1 y o1 a o2 - o1
        return (int) (o1.getSueldo() - o2.getSueldo());
    }
}
