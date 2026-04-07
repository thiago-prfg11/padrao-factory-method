package Tests;

import Classes.IServicoBancario;
import Classes.ServicoBancarioFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoCartaoCreditoTest {

    @Test
    void deveSolicitarCartaoCredito() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("CartaoCredito");
        assertEquals("Cartão de Crédito Solicitado Com Sucesso!" +
                " Obrigado Por Contratar Nossos Serviços!", servico.contratar());
    }

    @Test
    void deveCancelarCartaoCredito() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("CartaoCredito");
        assertEquals("Cartão de Crédito Cancelado! Caso Queria Reativá-lo," +
                " Procure Uma Agência!", servico.cancelar());
    }

    @Test
    void deveRetornarDescricaoCartaoCredito() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("CartaoCredito");
        assertEquals("Através Desse Serviço, Você Pode Solicitar um Novo e Moderno" +
                " Cartão de Crédito Exclusivo!", servico.descricao());
    }
}
