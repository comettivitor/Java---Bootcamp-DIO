import java.util.Scanner;

public class Multiplos {
    public void somaMultiplos() {
        Scanner scan = new Scanner(System.in);

        int a; // multiplo
        int n; // limite
        int x = 0;

        System.out.println("informe multiplo: ");
        a = scan.nextInt();
        System.out.println("informe limite: ");
        n = scan.nextInt();

        for(int i = a; i <= n; i++){
            if(i % a == 0){
                x = x + i;
            }
        }
        System.out.println(x);
    }
}
