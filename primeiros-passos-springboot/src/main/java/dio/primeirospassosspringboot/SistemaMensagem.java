package dio.primeirospassosspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente financeiro;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Cadastro Aprovado");
    }

    public void enviarMensagemBoasVindas(){
        financeiro.setEmail("teste@teste.com.br");
        System.out.println(financeiro);
        System.out.println("Bem-Vindo");
    }
}
