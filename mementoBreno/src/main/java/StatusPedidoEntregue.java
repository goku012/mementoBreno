public class StatusPedidoEntregue implements StatusPedido {

    private StatusPedidoEntregue() {
    }

    private static StatusPedidoEntregue instance = new StatusPedidoEntregue();

    public static StatusPedidoEntregue getInstance() {
        return instance;
    }

    public String getNomeStatus() {
        return "Entregue";
    }

}