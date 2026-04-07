package Tests;

import Classes.IServicoBancario;
import Classes.ServicoBancarioFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoContaCorrenteTest {

    @Test
    void deveAbrirContaCorrente() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("ContaCorrente");
        assertEquals("Sua Conta Corrente Foi Aberta Com Sucesso, Aproveite!", servico.contratar());
    }

    @Test
    void deveEncerrarContaCorrente() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("ContaCorrente");
        assertEquals("Conta Corrente Encerrada! Caso Tenha Dúvidas ou Questionamentos," +
                " Procure Nossa Equipe de Suporte!", servico.cancelar());
    }

    @Test
    void deveRetornarDescricaoContaCorrente() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("ContaCorrente");
        assertEquals("Através Desse Serviço, Você Pode Solicitar a Abertura Rápida" +
                " e Descomplicada da Sua Conta Corrente!", servico.descricao());
    }
}
