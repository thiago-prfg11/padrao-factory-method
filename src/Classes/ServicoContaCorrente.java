package Classes;

public class ServicoContaCorrente implements IServicoBancario {

    @Override
    public String contratar() {
        return "Sua Conta Corrente Foi Aberta Com Sucesso, Aproveite!";
    }

    @Override
    public String cancelar() {
        return "Conta Corrente Encerrada! Caso Tenha Dúvidas ou Questionamentos," +
                " Procure Nossa Equipe de Suporte!";
    }

    @Override
    public String descricao() {
        return "Através Desse Serviço, Você Pode Solicitar a Abertura Rápida" +
                " e Descomplicada da Sua Conta Corrente!";
    }
}
