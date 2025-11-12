package Herencia;

public class Principal {
    void main() {
        AguilaReal ave1 = new AguilaReal("Real", 3);
        //Aguila ave2 = ave1;
        // seria algo asi: Aguila ave2 = (AguilaReal)ave1;
        // se toma el comportamiento del abuelo, "No puedo volar"
        // El comportamiento se toma, no del tipo de la variable de referencia
        // si no del objeto a donde esta apuntando esa variable de referencia
        // el cual es Aguila Real
        ave1.volar();

        Ave ave2 = new AguilaCalva("Calva", 2);
        ave2.volar();
    }
}
