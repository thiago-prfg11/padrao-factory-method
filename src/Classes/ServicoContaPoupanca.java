package Classes;

public class ServicoContaPoupanca implements IServicoBancario {

    @Override
    public String contratar() {
        return "Sua Conta Poupança Foi Aberta!" +
                " Você Já Pode Começar a Usufruir dos Nossos Benefícios Exclusivos!";
    }

    @Override
    public String cancelar() {
        return "Sua Conta Poupança Foi Encerrada! Sentiremos Sua Falta!";
    }

    @Override
    public String descricao() {
        return "Através Desse Serviço, Você Pode Solicitar a Abertura Imediata da Sua Conta Poupança!";
    }
}
