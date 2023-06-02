package model;

import java.time.LocalDate;

/**
 *
 * @author crist
 */
public class Aluguel {

    private int codigo;
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;
    private Cliente cliente;
    private Veiculo veiculo;
    private Agencia agencia;
    private double valorTotal;

    public Aluguel() {
    }

    public Aluguel(int codigo, LocalDate dataRetirada, LocalDate dataDevolucao, Cliente cliente, Veiculo veiculo,
            Agencia agencia, double valorTotal) {
        this.codigo = codigo;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.agencia = agencia;
        this.valorTotal = valorTotal;

    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataRetirada() {
        return this.dataRetirada;
    }

    public void setDataRetirada(LocalDate dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
