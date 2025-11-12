package Operaciones;

public class Division extends Operacion{
    public Division(int x, int y) {
        super(x, y);
    }

    @Override
    int ejecutaOperacion() {
        return x / y;
    }

    @Override
    public String toString() {
        return "Division{" + "x=" + x + ", y=" + y + '}';
    }
}
