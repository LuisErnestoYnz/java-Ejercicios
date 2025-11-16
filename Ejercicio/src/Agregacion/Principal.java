package Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    void main() {
        // creamos el almacen
        Almacen almacen1 = new Almacen("Centro");

        // creamos los clientes
        Cliente cli1 = new Cliente("Patrobas");
        Cliente cli2 = new Cliente("Andronico");
        Cliente cli3 = new Cliente("Tercio");

        // antes de realizar el pago, al cliente debe se asignarsele un banco
        cli1.banco = new Banco("Azteca");

        // el cliente realiza el pago
        // a traves de un cliente se le delega al banco para que realice el pago
        cli1.realizarPago(100.00);

        // crear lista de clientes
        List<Cliente> listaClientes = new ArrayList<>();
        // agregar clientes
        listaClientes.add(cli1);
        listaClientes.add(cli2);
        listaClientes.add(cli3);

        // inicialmente como no tienen nada, sera un arreglo vacio
        System.out.println(almacen1.listaClientes);
        // asignamos la lista de clientes al almacen
        almacen1.setListaClientes(listaClientes);
        System.out.println(almacen1.listaClientes);

        // si se elimina el objeto a donde apunta la variable de referencia
        // listaClientes debe de seguir existiendo
        // se elimina el almacen, pero la listaClientes sigue existiendo
        almacen1 = null;
        System.out.println("Principal: " + listaClientes);
    }
}
