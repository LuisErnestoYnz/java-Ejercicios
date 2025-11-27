package Functional;

@FunctionalInterface
interface Operacion {
    // interfaz funcional tiene un solo metodo abstracto
    int ejecutar(int x, int y);

    // pueden tener metodos default y static
    default void informacion() {
        System.out.println("Operacion");
    }

    static void estado() {
        System.out.println("Soy una interfaz funcional");
    }
}
