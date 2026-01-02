package Polimorfismo;

public class Resta extends Operacion{
    public Resta(int x, int y) {
        super(x, y);
    }

    @Override
    public int ejecutarOperacion() {
        return x - y;
    }

}
