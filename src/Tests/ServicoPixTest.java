package Tests;

import Classes.IServicoBancario;
import Classes.ServicoBancarioFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoPixTest {

    @Test
    void deveCadastrarChavePix() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Pix");
        assertEquals("Sua Chave Foi Cadastrada e Ativada Com Sucesso!" +
                " Aproveite Para Começar a Usufruir das Transções Via PIX Agora Mesmo!", servico.contratar());
    }

    @Test
    void deveRemoverChavePix() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Pix");
        assertEquals("Sua Chave PIX Foi Removida e Desvinculada de Sua Conta!" +
                " Até o Cadastro de Uma Nova Chave, Você Não Poderá Mais Utilizar Este Serviço!", servico.cancelar());
    }

    @Test
    void deveRetornarDescricaoPix() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Pix");
        assertEquals("Através Desse Serviço, Você Poderá Cadastrar Uma Nova Chave" +
                " Pix Para Facilitar Ainda Mais Suas Transações Financeiras!", servico.descricao());
    }
}
