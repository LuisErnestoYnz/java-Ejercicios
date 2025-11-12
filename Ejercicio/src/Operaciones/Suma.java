package Operaciones;

public class Suma extends Operacion {
    public Suma(int x, int y) {
        super(x, y);
    }

    @Override
    int ejecutaOperacion() {
        return x + y;
    }

    @Override
    public String toString() {
        return "Suma{" + "y=" + y + ", x=" + x + '}';
    }
}
