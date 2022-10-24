import java.util.Scanner;

public class Tabuada {
    public void calculaTabuada(){
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Informe qual tabuada deseja visualizar: ");
        numero = scan.nextInt();
        System.out.println("Tabuada de " + numero);
        for(int i = 0; i <= 10; i++){
            int tabuada = numero * i;
            System.out.println(i + " x " + numero + " = " + tabuada);
        }
    }
}
