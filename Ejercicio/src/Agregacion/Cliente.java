package Agregacion;

public class Cliente {
    String nombre;
    Banco banco;

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    // tendra el comportamiento de pagar (delegara este trabajo al banco)
    void realizarPago(double cantidad) {
        // para confirmar que el banco haya efectuado el pago
        boolean resultadoPago = banco.pagar(cantidad);
        System.out.println(resultadoPago);
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" +nombre + "]";
    }
}
