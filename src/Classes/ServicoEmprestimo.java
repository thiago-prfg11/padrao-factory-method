package Classes;

public class ServicoEmprestimo implements IServicoBancario {

    @Override
    public String contratar() {
        return "Seu Novo Empréstimo Acaba de Ser Contratado, Parabéns!";
    }

    @Override
    public String cancelar() {
        return "Sua Solicitação de Empréstimo Foi Cancelada! Mas Não se Preocupe," +
                " Você Pode Solicitar Outro Empréstimo a Qualquer Momento!";
    }

    @Override
    public String descricao() {
        return "Através Desse Serviço, Você Pode Realizar a Contratação" +
                " de um Empréstimo Pessoal, de Forma Rápida e Fácil!";
    }
}
