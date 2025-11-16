package Agregacion;

public class Banco {
    String nombre;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    boolean pagar(double cantidad) {
        // logica para el pago
        System.out.println("El banco " +nombre+ " realizo el pago de " +cantidad);
        // como siempre se realiza el pago pondremos como valor de retorno true
        return true;
    }
}
