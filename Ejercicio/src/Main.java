import Clases.Aguila;
import Clases.Ave;
import Clases.Pato;

public class Main {
    void main() {
        Ave ave1 = new Ave("Ave1", 5);
        ave1.volar();
        System.out.println(ave1.nombre);
        System.out.println(ave1.edad);

        Aguila ave2 = new Aguila("Aguila1", 3);
        ave2.volar();
        System.out.println(ave2.nombre);
        System.out.println(ave2.edad);

        Pato ave3 = new Pato("Pato donald", 2);
        ave3.volar();
        System.out.println(ave3.nombre);
        System.out.println(ave3.edad);
    }
}
