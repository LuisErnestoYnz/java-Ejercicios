package lambdas;

public class Principal {
    public static void main(String[] args) {
        printThing((s) -> System.out.println("Meow" + s));
    }

    // metodo printThing que toma como parámetro un objeto Printable que puede ser cualquier objeto que implemente la interfaz Printable.
    static void printThing(Printable thing) {
        // se muestra la implementacion del metodo print para cualquier objeto que implemente la interfaz Printable
        // aqui como argumento pasamos una string
        thing.print("!");
    }
}
