package Herencia;

public class AguilaReal extends Aguila{
    public AguilaReal(String nombre, int edad) {
        super(nombre, edad);
    }

    // override al metodo volar
    @Override
    void volar() {
        System.out.println("Puedo volar como un aguila real");
    }
}
