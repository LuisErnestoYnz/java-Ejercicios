package Singleton;

public class Conexion {

    private String nombre;
    static int contador;
    private static Conexion conexion;

    private Conexion(String nombre) {
        this.nombre = nombre;
        contador++;
    }

    public static Conexion getInstance() {
        if (conexion == null) {
            // la conexion aun no se ha creado, crearla y devolverla
            conexion = new Conexion("nombre" + contador);
            return conexion;
        } else  {
            // si la conexion ya se creo, solo devolverla
            return conexion;
        }
    }
}
