package Classes;

public class ServicoBancarioFactory {

    public static IServicoBancario obterServico(String nomeServico) {
        if (nomeServico == null || nomeServico.isBlank()) {
            throw new IllegalArgumentException("Nome do Serviço Não Pode Ser Nulo ou Vazio");
        }

        Class<?> classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("Classes.Servico" + nomeServico);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException ex) {
            throw new IllegalArgumentException("O Serviço Solicitado Não Existe!");
        } catch (Exception ex) {
            throw new IllegalArgumentException("Erro ao Instanciar o Seguinte Serviço: " + nomeServico);
        }

        if (!(objeto instanceof IServicoBancario)) {
            throw new IllegalArgumentException("O Serviço Solicitado é Inválido!");
        }

        return (IServicoBancario) objeto;
    }
}
