package Clases;

public class Pato extends Ave{
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println("No puedo volar, ya que soy un " + this.nombre);
    }
}
