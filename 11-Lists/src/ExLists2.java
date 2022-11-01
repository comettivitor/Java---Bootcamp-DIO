import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExLists2 {
    public static void main(String[] args) throws Exception {
        List<Gato> gatos = new ArrayList<>() {
            {
                add(new Gato("jon", 18, "preto"));
                add(new Gato("Simba", 7, "Tigrado"));
                add(new Gato("jon", 12, "Amarelo"));
            }
        };
        // Imprime por ordem de inserção
        System.out.println("Imprime por ordem de inserção");
        System.out.println(gatos);
        System.out.println("");

        // Imprime por ordem aleatória
        System.out.println("Imprime por ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("");

        // Ordem alfabética
        System.out.println("Imprime por ordem alfabética");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("");

        // Ordem idade
        System.out.println("Imprime por ordem idade");
        Collections.sort(gatos, new CompatorIdade());
        System.out.println(gatos);
        System.out.println("");

        // Ordem alfabética de cor
        System.out.println("Imprime por ordem de cor");
        Collections.sort(gatos, new CompatorCor());
        System.out.println(gatos);
        System.out.println("");

        //Ordem nome, cor, idade
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }

}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato() {

    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Sem essa sobreescrita do método imprime apenas endereço de memória
    @Override
    public String toString() {
        return "Gato {nome=" + nome +
                ", idade=" + idade +
                ", cor=" + cor + "}";
    }

    // Sobreescrita de interface Comparable
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}

//Classe que compara idades de gatos
class CompatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

//Classe que compara cores de gatos
class CompatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0){
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0){
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    
}