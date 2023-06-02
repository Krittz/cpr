package controller;

import model.Veiculo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author crist
 */
public class VeiculoController {

  private final ArrayList<Veiculo> veiculos;

  public VeiculoController(ArrayList<Veiculo> veiculos) {
    this.veiculos = veiculos;
  }

  public void cadastrar(Veiculo veiculo) {
    veiculos.add(veiculo);
  }

  public void excluir(Veiculo veiculo) {
    veiculos.remove(veiculo);
  }

  public void editar(String placa, String marca, String modelo, String ano, double diaria, boolean disponivel) {
    Iterator<Veiculo> it = veiculos.iterator();
    while (it.hasNext()) {
      Veiculo v = it.next();
      if (v.getPlaca().equals(placa)) {
        v.setMarca(marca);
        v.setModelo(modelo);
        v.setAno(ano);
        v.setDiaria(diaria);
        v.setDisponivel(disponivel);
      }
    }
  }

  public Veiculo buscarPorPlaca(String placa) {
    Iterator<Veiculo> it = veiculos.iterator();
    while (it.hasNext()) {
      Veiculo v = it.next();
      if (v.getPlaca().equals(placa)) {
        return v;
      }
    }
    return null;
  }

  public ArrayList<Veiculo> getVeiculos() {
    return veiculos;
  }

  public boolean listaVazia() {
    if (veiculos.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }
}
