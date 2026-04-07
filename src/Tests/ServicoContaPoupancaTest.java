package Tests;

import Classes.IServicoBancario;
import Classes.ServicoBancarioFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServicoContaPoupancaTest {

    @Test
    void deveAbrirContaPoupanca() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("ContaPoupanca");
        assertEquals("Sua Conta Poupança Foi Aberta!" +
                " Você Já Pode Começar a Usufruir dos Nossos Benefícios Exclusivos!", servico.contratar());
    }

    @Test
    void deveEncerrarContaPoupanca() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("ContaPoupanca");
        assertEquals("Sua Conta Poupança Foi Encerrada! Sentiremos Sua Falta!", servico.cancelar());
    }

    @Test
    void deveRetornarDescricaoContaPoupanca() {
        IServicoBancario servico = ServicoBancarioFactory.obterServico("ContaPoupanca");
        assertEquals("Através Desse Serviço, Você Pode Solicitar" +
                " a Abertura Imediata da Sua Conta Poupança!", servico.descricao());
    }
}
