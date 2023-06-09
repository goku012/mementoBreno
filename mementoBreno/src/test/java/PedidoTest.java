import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveArmazenarHistoricoDeStatus() {
        Pedido pedido = new Pedido();
        pedido.setStatus(StatusPedidoRecebido.getInstance());
        pedido.setStatus(StatusPedidoPreparo.getInstance());
        assertEquals(2, pedido.getHistorico().size());
    }

    @Test
    void deveRetornarStatusInicial() {
        Pedido pedido = new Pedido();
        pedido.setStatus(StatusPedidoRecebido.getInstance());
        pedido.setStatus(StatusPedidoPreparo.getInstance());
        pedido.restaurarStatus(0);
        assertEquals(StatusPedidoRecebido.getInstance(), pedido.getStatus());
    }

    @Test
    void deveRetornarStatusAnterior() {
        Pedido pedido = new Pedido();
        pedido.setStatus(StatusPedidoRecebido.getInstance());
        pedido.setStatus(StatusPedidoPreparo.getInstance());
        pedido.setStatus(StatusPedidoRecebido.getInstance());
        pedido.setStatus(StatusPedidoEntregue.getInstance());
        pedido.restaurarStatus(2);
        assertEquals(StatusPedidoRecebido.getInstance(), pedido.getStatus());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Pedido pedido = new Pedido();
            pedido.restaurarStatus(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}