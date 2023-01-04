package dio.primeirospassosspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {
    @Bean
    public Remetente remetente(){
        System.out.println("Criando objeto remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@teste.com.br");
        remetente.setNome("Teste");
        return remetente;
    }
}
