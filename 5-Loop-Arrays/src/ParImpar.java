import java.util.Scanner;

public class ParImpar {
    public void verificaParImpar(){
        Scanner scan = new Scanner(System.in);

        int quantidade = 0;
        int numero;
        int count = 0;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Informe uma quantidade: ");
        quantidade = scan.nextInt();
        System.out.println(quantidade + " números serão informados!");
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                quantPares++;
            }else{
                quantImpares++;
            }

            count++;
        }while(count < quantidade);

        System.out.println("Quantidade de números Pares: " + quantPares);
        System.out.println("Quantidade de números Impares: " + quantImpares);

    }
}
