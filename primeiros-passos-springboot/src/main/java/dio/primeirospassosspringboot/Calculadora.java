package dio.primeirospassosspringboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int a, int b){
        int soma = a + b;
        return soma;
    }
}
