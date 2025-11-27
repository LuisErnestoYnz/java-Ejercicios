package Functional;

public class Principal {
    void main() {
        // se implementa la operacion suma a traves de una funcion lambda
        Operacion suma = (a, b) -> a + b;
        System.out.println(suma.ejecutar(3, 4));

        Operacion resta = new Operacion() {
            @Override
            public int ejecutar(int x, int y) {
                return x - y;
            }
        };
        System.out.println(resta.ejecutar(8, 4));
    }
}
