package Herencia;

public class AguilaCalva extends Aguila{
    public AguilaCalva(String nombre, int edad) {
        super(nombre, edad);
    }

    // override al metodo volar
    @Override
    void volar() {
        System.out.println("Puedo volar como un aguila calva");
    }
}
