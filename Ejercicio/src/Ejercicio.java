import java.util.Arrays;

public class Ejercicio {
    void main () {
        int[] arr = {1, 6, 3, 8, 7, 5, 2, 4};

        System.out.println("\nTamaño: " + arr.length);
        // Ordenar el arreglo
        Arrays.sort(arr);

        // Recorre el arreglo e imprime valores
        for(int elemento: arr) {
            System.out.print(elemento + " ");
        }

        // busqueda binaria
        System.out.println(Arrays.binarySearch(arr, 5));
    }
}
