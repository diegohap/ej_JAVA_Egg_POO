package EjGrupal4.service;

import EjGrupal4.model.Cliente;
import java.util.ArrayList;
import java.util.Optional;

public class ClienteService {
    ArrayList<Cliente> clientes;

    public ClienteService() {
        this.clientes = new ArrayList<>();
    }
    public ArrayList<Cliente> obtenerClientes(){
        return this.clientes;
    }
    public Optional<Cliente> obtenerClientePorId(Integer id){
//        for (int i = 0; i < clientes.size(); i++) {
//            Cliente c = clientes.get(i);
//            if(c.getId().equals(id))
//                return Optional.of(c);
//        }
        for(Cliente c : clientes) {
            if(c.getId().equals(id))
                return Optional.of(c);
        }
        return Optional.empty();
    }
    public Cliente registrarCliente(Integer id, String nombre, Integer edad, Double altura, Double peso, String objetivo){
        if(!existeCliente(id)){
            Cliente cliente = new Cliente(id, nombre, edad, altura, peso, objetivo);
            clientes.add(cliente);
        }
        else{
            actualizarCliente(id, nombre, edad, altura, peso, objetivo);
        }
        return obtenerClientePorId(id).get();
    }
    public Cliente registrarCliente(Cliente cliente){
        if(!existeCliente(cliente.getId())){
            clientes.add(cliente);
        }
        else{
            actualizarCliente(cliente);
        }
        return obtenerClientePorId(cliente.getId()).get();
    }
    public Optional<Cliente> actualizarCliente(Integer id, String nombre, Integer edad, Double altura, Double peso, String objetivo){
        if(existeCliente(id)){
            Cliente cliente = obtenerClientePorId(id).get();
            cliente.setNombre(nombre);
            cliente.setEdad(edad);
            cliente.setPeso(peso);
            cliente.setAltura(altura);
            cliente.setObjetivo(objetivo);
            clientes.set(getIndexClientById(id), cliente);
            return obtenerClientePorId(id);
        }
        return Optional.empty();
    }
    public Optional<Cliente> actualizarCliente(Cliente cliente){
        if(existeCliente(cliente.getId())) {
            clientes.set(getIndexClientById(cliente.getId()), cliente);
            return obtenerClientePorId(cliente.getId());
        }
        return Optional.empty();
    }
    public void eliminarCliente(Integer id){
        if(existeCliente(id))
            clientes.remove(obtenerClientePorId(id).get());
    }
    private Boolean existeCliente(Integer id){
        for (Cliente c : clientes) {
            if(c.getId().equals(id))
                return true;
        }
        return false;
    }
    private Integer getIndexClientById(Integer id){
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getId().equals(id))
                return i;
        }
        return 0;
    }
}
