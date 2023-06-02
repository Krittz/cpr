package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.*;

/**
 *
 * @author crist
 */
public class BaseDeDados {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Aluguel> alugueis = new ArrayList<>();
    private List<Veiculo> veiculos = new ArrayList<>();
    private List<Agencia> agencias = new ArrayList<>();
  

    public void atualizarClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void atualizarVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void atualizarAlugueis(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public void atualizarAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

   

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }


    public Aluguel buscarAluguelPorCodigo(int codigo) {
        Iterator<Aluguel> it = alugueis.iterator();
        while (it.hasNext()) {
            Aluguel al = it.next();
            if (al.getCodigo() == codigo) {
                return al;
            }
        }
        return null;
    }

}
