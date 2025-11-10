import java.util.ArrayList;

public class EjercicioCadena {
    public ArrayList<Character> getCadena(String cadena) {
        ArrayList<Character> arr = new ArrayList<>();
        // Llenar de 0´s el arreglo
        for(int i = 0; i <= 7; i++) {
            arr.add('0');
        }

        // Limitar a 8 el tamaño de la cadena
        for(int i = 0; i <= cadena.length()-1; i++) {
            arr.set(i, cadena.charAt(i));
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
                arr.set(i, '0');
            }
        }
        return arr;
    }

    void main() {
        //ArrayList<Character> arregloResultado = getCadena("Alacran");
        for(char letra: getCadena("alejandro")) {
            System.out.print(letra + " ");
        }
    }
}

// 0l0c0000
