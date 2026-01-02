package Singleton;

public class Principal {
    static void main() {
        // creacion de las conexiones
        System.out.println(Conexion.contador);
        Conexion conexion1 = Conexion.getInstance();
        System.out.println(Conexion.contador);
        Conexion conexion2 = Conexion.getInstance();
        System.out.println(Conexion.contador);
        Conexion conexion3 = Conexion.getInstance();

        // se verifica que solamente se ha creado una sola instancia para las 3 conexiones
        System.out.println(Conexion.contador);
    }
}
