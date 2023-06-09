import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private StatusPedido status;
    private List<StatusPedido> historico = new ArrayList<>();

    public StatusPedido getStatus() {
        return this.status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
        this.historico.add(this.status);
    }

    public void restaurarStatus(int indice) {
        if (indice < 0 || indice > this.historico.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.status = this.historico.get(indice);
    }

    public List<StatusPedido> getHistorico() {
        return this.historico;
    }
}