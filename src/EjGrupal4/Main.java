package EjGrupal4;

import EjGrupal4.model.Cliente;
import EjGrupal4.service.ClienteService;

public class Main {
    public static void main(String[] args) {
        Integer idPrueba = 9;
        ClienteService clienteService = new ClienteService();
        Cliente c1 = new Cliente(4, "Maria", 25, 1.0,65.0, "trabajo abdominal");
        Cliente c2 = new Cliente(5, "Gonzalo", 56, 1.0,89.0, "ganar masa muscular");
        Cliente c3 = new Cliente(2, "Sara", 27, 1.6, 55.0, "tonificar");
        Cliente c4 = new Cliente(1, "martin", 30, 1.88d, 75.0, "adelgazar");
        Cliente c5 = new Cliente(3, "Rodrigo", 27, 1.65, 55.0, "tonificar");

        clienteService.registrarCliente(c1);
        clienteService.registrarCliente(5, "Gonzalo", 56, 1.0,89.0, "ganar masa muscular");
        clienteService.registrarCliente(c3);
        clienteService.registrarCliente(c4);
        clienteService.registrarCliente(c5);

        System.out.println("---   TODOS LOS CLIENTES   ---");
        for(Cliente c : clienteService.obtenerClientes()){
            System.out.println(c.toString());
        }

        System.out.println("---   CLIENTE Id="+idPrueba+"   ---");
        if(!clienteService.obtenerClientePorId(idPrueba).isEmpty())
            System.out.println(clienteService.obtenerClientePorId(idPrueba).get().toString());
        else
            System.out.println("el cliente no existe");

        System.out.println("---   CLIENTE Id=5 ACTUALIZADO");
        clienteService.actualizarCliente(5, "Pablo", 56, 1.1,69.0, "perder peso");
        if(!clienteService.obtenerClientePorId(5).isEmpty())
            System.out.println(clienteService.obtenerClientePorId(5).get().toString());
        else
            System.out.println("el cliente no existe");

        System.out.println("---   ELIMINANDO EL CLIENTE Id=5   ---");
        clienteService.eliminarCliente(5);
        if(!clienteService.obtenerClientePorId(5).isEmpty())
            System.out.println(clienteService.obtenerClientePorId(5).get().toString());
        else
            System.out.println("el cliente no existe");

        System.out.println("---   REIMPRIME TODOS LOS CLIENTES   ---");
        for(Cliente c : clienteService.obtenerClientes()){
            System.out.println(c.toString());
        }
    }
}
