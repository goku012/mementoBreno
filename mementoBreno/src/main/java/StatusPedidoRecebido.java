public class StatusPedidoRecebido implements StatusPedido {

    private StatusPedidoRecebido() {
    }

    private static StatusPedidoRecebido instance = new StatusPedidoRecebido();

    public static StatusPedidoRecebido getInstance() {
        return instance;
    }

    public String getNomeStatus() {
        return "Recebido";
    }

}