import java.util.Scanner;

public class BuscaSequencial {
    Scanner leitor = new Scanner(System.in);

    int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };
    

    public String confereVetor(int leitor) {
        for (int i = 0; i < elementos.length; i++) {
            if (leitor == elementos[i]) {
                return "Achei " + leitor + " na posicao " + i;
            }
        }
        return "Numero " + leitor + " nao encontrado!";
    }
}
