package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.Pagamento;
/**
 *
 * @author crist
 */
public class PagamentoController {

    private final ArrayList<Pagamento> pagamentos;

    public PagamentoController(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public void cadastrar(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void excluir(Pagamento pagamento) {
        pagamentos.remove(pagamento);
    }

    public Pagamento buscarPorCodigo(String codigo) {
        Iterator<Pagamento> it = pagamentos.iterator();
        while (it.hasNext()) {
            Pagamento p = it.next();
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    public boolean listaVazia() {
        if (pagamentos.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

}
