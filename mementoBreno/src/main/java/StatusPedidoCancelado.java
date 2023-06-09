public class StatusPedidoCancelado implements StatusPedido {

    private StatusPedidoCancelado() {
    }

    private static StatusPedidoCancelado instance = new StatusPedidoCancelado();

    public static StatusPedidoCancelado getInstance() {
        return instance;
    }

    public String getNomeStatus() {
        return "Cancelado";
    }

}