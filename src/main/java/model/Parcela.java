package model;

import java.time.LocalDate;

/**
 *
 * @author crist
 */
public class Parcela {

    private String id;
    private double valor;
    private LocalDate vencimento;

    public Parcela(String id, double valor, LocalDate vencimento) {
        this.id = id;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

}
