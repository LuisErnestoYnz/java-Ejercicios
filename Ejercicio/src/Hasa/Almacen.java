package Hasa;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    String nombre;
    // Como el almacén debe ser un contenedor para varias cuentas, para manejar varias lo ideal es meter Cuentas en un ArrayList
    List<Cuenta> listaCuentas = new ArrayList<>();

    public Almacen(String nombre) {
        this.nombre = nombre;
    }

    // pasamos en este metodo las cuentas y las agregamos a la lista de cuentas
    void setCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "Almacen{" + "nombre='" + nombre + '\'' + '}';
    }
}
