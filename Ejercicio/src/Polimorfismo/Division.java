package Polimorfismo;

public class Division extends Operacion{
    public Division(int x, int y) {
        super(x, y);
    }

    @Override
    public int ejecutarOperacion() {
        return x / y;
    }

}
