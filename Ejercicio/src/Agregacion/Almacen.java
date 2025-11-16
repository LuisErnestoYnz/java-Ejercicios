package Agregacion;

import Hasa.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    String nombre;
    // Como el almacén debe ser un contenedor para varias cuentas, para manejar varias lo ideal es meter Cuentas en un ArrayList
    List<Cuenta> listaCuentas = new ArrayList<>();
    List<Cliente> listaClientes;

    public Almacen(String nombre) {
        this.nombre = nombre;
        listaClientes = new ArrayList<>();
    }

    // pasamos en este metodo las cuentas y las agregamos a la lista de cuentas
    void setCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }

    void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public String toString() {
        return "Almacen{" + "nombre='" + nombre + '\'' + '}';
    }
}
