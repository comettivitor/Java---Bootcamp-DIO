import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<String> arco = new TreeSet<>(Arrays.asList("amarelo", "vermelho", "laranja", "verde", "azul", "violeta"));

        System.out.println("Exibe cores: ");
        for(String arcoIris: arco){
            System.out.println(arcoIris);
        }
        System.out.println(" ");

        System.out.println("Total de cores: ");
        System.out.println(arco.size() + "Cores no total!");
        System.out.println(" ");

        System.out.println("Exibe ordem alfabética: ");
        Set<String> arco2 = new TreeSet<>(arco);
        System.out.println(arco2);
        System.out.println(" ");

        System.out.println("Inverte cores da ordem informada: ");
        List<String> arco3 = new ArrayList<String>();
        arco3.addAll(arco);
        Collections.reverse(arco3);
        System.out.println(arco3);
        System.out.println(" ");

        System.out.println("Exibe cores que comecam com letra V: ");
        for(String i : arco){
            if(i.startsWith("v")){
                System.out.println(i);
            }
        }
        System.out.println(" ");

        System.out.println("Remove cores que não começam com letra V: ");
        for(String i : arco){
            if(!i.startsWith("v")){
                System.out.println(i);
            }
        }
        System.out.println(" ");

        System.out.println("Limpa conjunto: ");
        arco.clear();
        System.out.println(arco);
        System.out.println(" ");

        System.out.println("Confere se conjuntos esta vazio: ");
        System.out.println(arco.isEmpty());
    }
}

class Cores{
    private String cor;

    public Cores(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }    
}