import java.util.ArrayList;

public class EjercicioStrings {
    void main() {
        String nombre = "Luis Ernesto";

        // Operaciones con strings
        System.out.println("Tamaño del nombre: " + nombre.length());
        // caracter en un indice especifico
        ArrayList<Character> arregloCaracteres = new ArrayList<>();

        // itera el string
        for(int i = 0; i < nombre.length(); i ++) {
            // charAt() dado un indice, devuelve el caracter en la posición del indice especificado
            arregloCaracteres.add(nombre.charAt(i));
        }

        // imprime el arreglo
        for (char elemento: arregloCaracteres) {
            System.out.print(elemento);
        }

        // devuelve el index con la primera coincidencia del caracter
        System.out.println("\n" + nombre.indexOf("Ern"));

        // devuelve partes de la cadena
        System.out.println(nombre.substring(5, 12));

        // devuelve cadena en mayusculas
        String cadenaMayusculas = nombre.toUpperCase();
        System.out.println(cadenaMayusculas);

        // compara si ambas cadenas tienen el mismo contenido, ignorando si tieen mayusculas o minusculas
        if(nombre.equalsIgnoreCase(cadenaMayusculas)) {
            System.out.println("las cadenas " + nombre + " y " + cadenaMayusculas + " son iguales en contenido.");
        }

        // Si la cadena comienza con una letra o subcadena en particular
        if(nombre.startsWith("Lu")) {
            System.out.println("La cadena " + nombre + " comienza con Lu");
        }

        // busca coincidencias en cualquier parte de la cadena
        if(nombre.contains("Erw")) {
            System.out.println(nombre.toUpperCase());
        } else {
            System.out.println(nombre.toLowerCase());
        }

        // reemplaza un caracter por otro, elimina espacios al inicio y final y transforma la cadena en minusculas
        String cadena2 = " Hola Mundote ";
        System.out.println(cadena2.replace('o', 'e').trim().toLowerCase());
        System.out.println(cadena2.concat(nombre));
    }
}
