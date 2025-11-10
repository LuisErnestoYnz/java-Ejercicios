import java.util.ArrayList;

public class EjercicioArrayList {
    void main() {
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos al arraylist
        nombres.add("Luis");
        nombres.add("Andrea");
        nombres.add("Felipe");
        nombres.add(0, "Ernesto");


            // Eliminar elementos
            nombres.remove("Felipe");
            nombres.remove(2);

            // Cambia un elemento
            nombres.set(0, "Andres");
            // obtener un elemento
            String n = nombres.get(1);

            System.out.println(nombres);
            System.out.println("Nombre obtenido: " + n);

        if(!nombres.isEmpty()) {
            nombres.clear();
        }

    }
}
