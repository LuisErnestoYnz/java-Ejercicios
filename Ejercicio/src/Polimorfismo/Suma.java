package Polimorfismo;

public class Suma extends Operacion {
    public Suma(int x, int y) {
        super(x, y);
    }

    @Override
    public int ejecutarOperacion() {
        return x + y;
    }

}
