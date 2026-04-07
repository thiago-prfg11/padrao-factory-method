package Tests;

import Classes.IServicoBancario;
import Classes.ServicoBancarioFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoBancarioFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IServicoBancario servico = ServicoBancarioFactory.obterServico("Financiamento");
            fail("Deveria lançar exceção para serviço inexistente");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("O Serviço Solicitado Não Existe!"));
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IServicoBancario servico = ServicoBancarioFactory.obterServico("Investimento");
            fail("Deveria lançar exceção para serviço inválido");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("O Serviço Solicitado é Inválido!"));
        }
    }

    @Test
    void deveRetornarExcecaoParaNomeNulo() {
        try {
            IServicoBancario servico = ServicoBancarioFactory.obterServico(null);
            fail("Deveria lançar exceção para nome nulo");
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do Serviço Não Pode Ser Nulo ou Vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaNomeVazio() {
        try {
            IServicoBancario servico = ServicoBancarioFactory.obterServico("  ");
            fail("Deveria lançar exceção para nome vazio");
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do Serviço Não Pode Ser Nulo ou Vazio", e.getMessage());
        }
    }
}
