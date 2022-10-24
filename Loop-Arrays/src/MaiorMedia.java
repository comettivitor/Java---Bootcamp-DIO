import java.util.Scanner;

public class MaiorMedia {
    public void calculaValores(){
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = 0;
        int count = 0;

        do{
            System.out.println("Informe número: ");
            numero = scan.nextInt();

            if(numero > maior){
                maior = numero;
            }

            if(numero < menor){
                menor = numero;
            }

            
        System.out.println(count);
        }while(count++ < 5);

        int soma = 0;
        soma = soma + numero;
        double media = soma /5;
        System.out.println("O maior número informado foi: " + maior);
        System.out.println("A média dos números é: " + media);
    }
}
