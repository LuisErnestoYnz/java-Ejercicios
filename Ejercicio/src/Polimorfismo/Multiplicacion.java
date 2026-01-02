package Polimorfismo;

public class Multiplicacion extends Operacion {
    public Multiplicacion(int x, int y) {
        super(x, y);
    }

    @Override
    public int ejecutarOperacion() {
        return x * y;
    }

}
