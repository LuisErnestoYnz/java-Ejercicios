package Hasa;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    void main() {
        // Creamos una instancia del Almacen
        Almacen almacen1 = new Almacen("Centro");

        // Almacenamos las cuentas creadas en el almacen a traves de su metodo setCuentas
        almacen1.setCuenta(new Cuenta("x001"));
        almacen1.setCuenta(new Cuenta("z005"));
        almacen1.setCuenta(new Cuenta("y007"));
        System.out.println(almacen1.listaCuentas);

        // Elimimamos el almacen, y tambien se eliminara las cuentas
        almacen1 = null;


    }
}
