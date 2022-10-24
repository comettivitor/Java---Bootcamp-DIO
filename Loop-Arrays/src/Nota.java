import java.util.Scanner;

public class Nota {
    Scanner scan = new Scanner(System.in);

    int nota;

    public void calculaNotas(){
        System.out.println("Informe sua nota por favor: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite Novamente: ");
            nota = scan.nextInt();
        }
    }
}
