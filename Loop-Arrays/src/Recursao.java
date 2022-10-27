import java.util.Scanner;

public class Recursao {
    Scanner numero = new Scanner(System.in);

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
