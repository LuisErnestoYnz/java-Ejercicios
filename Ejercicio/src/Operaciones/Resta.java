package Operaciones;

public class Resta extends Operacion{
    public Resta(int x, int y) {
        super(x, y);
    }

    @Override
    int ejecutaOperacion() {
        return x - y;
    }

    @Override
    public String toString() {
        return "Resta{" + "x=" + x + ", y=" + y + '}';
    }
}
