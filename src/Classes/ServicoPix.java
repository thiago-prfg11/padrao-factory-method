package Classes;

public class ServicoPix implements IServicoBancario {

    @Override
    public String contratar() {
        return "Sua Chave Foi Cadastrada e Ativada Com Sucesso!" +
                " Aproveite Para Começar a Usufruir das Transções Via PIX Agora Mesmo!";
    }

    @Override
    public String cancelar() {
        return "Sua Chave PIX Foi Removida e Desvinculada de Sua Conta!" +
                " Até o Cadastro de Uma Nova Chave, Você Não Poderá Mais Utilizar Este Serviço!";
    }

    @Override
    public String descricao() {
        return "Através Desse Serviço, Você Poderá Cadastrar Uma Nova Chave" +
                " Pix Para Facilitar Ainda Mais Suas Transações Financeiras!";
    }
}
