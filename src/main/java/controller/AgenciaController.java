package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.Agencia;

/**
 *
 * @author crist
 */
public class AgenciaController {
    
    private final ArrayList<Agencia> agencias;
    
    public AgenciaController(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }
    
    public void cadastrar(Agencia agencia) {
        agencias.add(agencia);
    }
    
    public void excluir(Agencia agencia) {
        agencias.remove(agencia);
    }
    
    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
    
    public Agencia buscarPorCodigo(String codigo) {
    Iterator<Agencia> it = agencias.iterator();
    while (it.hasNext()) {
        Agencia a = it.next();
        if (a.getCodigo().equals(codigo)) {
            return a;
        }
    }
    return null; 
}
    
    public void editar(String codigo, String nome, String telefone, String endereco, String abertura, String fechamento) {
        Iterator<Agencia> it = agencias.iterator();
        while (it.hasNext()) {
            Agencia a = it.next();
            if (a.getCodigo().equals(codigo)) {
                a.setNome(nome);
                a.setTelefone(telefone);
                a.setEndereco(endereco);
                a.setAbertura(abertura);
                a.setFechamento(fechamento);
            }
        }
    }
    
    public boolean listaVazia() {
        if (agencias.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
