import java.util.Scanner;

public class Fatorial {
    public void calculaFatorial(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero que deseja saber o fatorial: ");
        int numero = scan.nextInt();

        int fatorial = 1;

        for(int i = numero; i >= 1; i--){
            fatorial = fatorial * i;
        }

        System.out.println(numero + " fatorial é = " + fatorial);
    }
}
