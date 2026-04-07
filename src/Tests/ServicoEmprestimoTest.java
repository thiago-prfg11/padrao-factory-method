package Tests;

import Classes.IServicoBancario;
import Classes.ServicoBancarioFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoEmprestimoTest {

    @Test
    void deveContratarEmprestimo() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Emprestimo");
        assertEquals("Seu Novo Empréstimo Acaba de Ser Contratado, Parabéns!", servico.contratar());
    }

    @Test
    void deveCancelarEmprestimo() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Emprestimo");
        assertEquals("Sua Solicitação de Empréstimo Foi Cancelada! Mas Não se Preocupe," +
                " Você Pode Solicitar Outro Empréstimo a Qualquer Momento!", servico.cancelar());
    }

    @Test
    void deveRetornarDescricaoEmprestimo() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Emprestimo");
        assertEquals("Através Desse Serviço, Você Pode Realizar a Contratação" +
                " de um Empréstimo Pessoal, de Forma Rápida e Fácil!", servico.descricao());
    }
}
