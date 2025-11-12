package Herencia;

public class Ave {
    String nombre;
    int edad;

    public Ave(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Agregamos un comportamenti
    void volar() {
        System.out.println("No puedo volar");
    }
}
