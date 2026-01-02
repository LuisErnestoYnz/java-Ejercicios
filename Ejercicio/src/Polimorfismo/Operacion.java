package Polimorfismo;

public abstract class Operacion {
    public int x;
    public int y;

    // para definir a clases hijas
    public Operacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract int ejecutarOperacion();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
