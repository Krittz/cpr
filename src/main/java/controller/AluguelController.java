package controller;

import java.time.LocalDate;
import model.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author crist
 */
public class AluguelController {

    private final ArrayList<Aluguel> alugueis;
    private static int proximoCodigo = 1;

    public AluguelController(ArrayList<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public void cadastrar(LocalDate retirada, LocalDate devolucao, Veiculo veiculo, Agencia agencia, Cliente cliente, double total) {
        Aluguel aluguel = new Aluguel();
        aluguel.setCodigo(proximoCodigo);
        aluguel.setDataRetirada(retirada);
        aluguel.setDataDevolucao(devolucao);
        aluguel.setVeiculo(veiculo);
        aluguel.setCliente(cliente);
        aluguel.setAgencia(agencia);
        aluguel.setValorTotal(total);
        alugueis.add(aluguel);
        proximoCodigo++;
    }

    public void excluir(Aluguel aluguel) {
        alugueis.remove(aluguel);
    }

    public void editar(int codigo, LocalDate retirada, LocalDate devolucao, Cliente cliente, Veiculo veiculo, Agencia agencia, double valorTotal) {
        Iterator<Aluguel> it = alugueis.iterator();
        while (it.hasNext()) {
            Aluguel c = it.next();
            if (c.getCodigo() == codigo) {
                c.setDataRetirada(retirada);
                c.setDataDevolucao(devolucao);
                c.setCliente(cliente);
                c.setVeiculo(veiculo);
                c.setAgencia(agencia);
                c.setValorTotal(valorTotal);
            }
        }
    }

    public boolean listaVazia() {
        if (alugueis.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public Aluguel buscarPorCodigo(int codigo) {
        Iterator<Aluguel> it = alugueis.iterator();
        while (it.hasNext()) {
            Aluguel a = it.next();
            if (a.getCodigo() == codigo) {
                return a;
            }
        }
        return null;
    }

    public ArrayList<Aluguel> getAlugueis() {
        return alugueis;
    }
}
