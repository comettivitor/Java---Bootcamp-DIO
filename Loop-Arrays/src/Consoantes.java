import java.util.Arrays;
import java.util.Scanner;

public class Consoantes {
    public void leConsoantes() {
        Scanner scan = new Scanner(System.in);
        int quantConsoante = 0;
        String[] consoantes = new String[6];

        for (int i = 1; i <= consoantes.length; i++) {
            System.out.println("Informe letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                quantConsoante++;
            }
        }
        System.out.println("Foram informadas " + quantConsoante + " consoante(s)");
        System.out.println(Arrays.toString(consoantes));
        
    }
}
