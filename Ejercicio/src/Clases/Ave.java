package Clases;

public class Ave {
    public String nombre;
    public int edad;

    public Ave(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    public void volar() {
        System.out.println("Puedo volar como Ave " + this.nombre);
    }
}
