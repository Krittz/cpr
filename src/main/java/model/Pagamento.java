package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author crist
 */
public class Pagamento {

    private String codigo;
    private Aluguel aluguel;
    private double valorTotal;
    private ArrayList<Parcela> parcelas;

    public Pagamento() {

    }

    public Pagamento(String codigo, double valorTotal, ArrayList<Parcela> parcelas, Aluguel aluguel) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
        this.parcelas = parcelas;
        this.aluguel = aluguel;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(ArrayList<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        hash = 17 * hash + Objects.hashCode(this.aluguel);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.valorTotal) ^ (Double.doubleToLongBits(this.valorTotal) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.parcelas);
        return hash;
    }

 
}
