package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.Cliente;

/**
 *
 * @author crist
 */
public class ClienteController {

    private final ArrayList<Cliente> clientes;
    private int proximoCodigo = 01;

    public ClienteController(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void cadastrar(String nome, String cnh, String email, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(proximoCodigo);
        cliente.setNome(nome);
        cliente.setCnh(cnh);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        clientes.add(cliente);
        proximoCodigo++;
    }

    public void excluir(Cliente cliente) {
        clientes.remove(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarPorCnh(String cnh) {
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCnh().equals(cnh)) {
                return c;
            }
        }
        return null;
    }

    public Cliente buscarPorCodigo(int codigo) {
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }

    public void editar(int codigo, String nome, String cnh, String email, String telefone) {
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCodigo() == codigo) {
                c.setNome(nome);
                c.setCnh(cnh);
                c.setEmail(email);
                c.setTelefone(telefone);
            }
        }
    }

    public boolean listaVazia() {
        if (clientes.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
