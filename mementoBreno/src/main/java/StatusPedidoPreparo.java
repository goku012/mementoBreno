public class StatusPedidoPreparo implements StatusPedido {

    private StatusPedidoPreparo() {
    }

    private static StatusPedidoPreparo instance = new StatusPedidoPreparo();

    public static StatusPedidoPreparo getInstance() {
        return instance;
    }

    public String getNomeStatus() {
        return "Em preparo";
    }

}