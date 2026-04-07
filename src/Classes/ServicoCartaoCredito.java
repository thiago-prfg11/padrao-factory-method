package Classes;

public class ServicoCartaoCredito implements IServicoBancario {

    @Override
    public String contratar() {
        return "Cartão de Crédito Solicitado Com Sucesso! Obrigado Por Contratar Nossos Serviços!";
    }

    @Override
    public String cancelar() {
        return "Cartão de Crédito Cancelado! Caso Queria Reativá-lo, Procure Uma Agência!";
    }

    @Override
    public String descricao() {
        return "Através Desse Serviço, Você Pode Solicitar um Novo e Moderno" +
                " Cartão de Crédito Exclusivo!";
    }
}
