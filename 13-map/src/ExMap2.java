import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExMap2 {
    public static void main(String[] args) {

        Map<String, Livro> livros = new HashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
                put("Duhigg, Charles", new Livro("O poder do hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));

            }
        };

        System.out.println("Ordem aleatoria");
        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("----------------------------------------");

        Map<String, Livro> livros2 = new LinkedHashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
                put("Duhigg, Charles", new Livro("O poder do hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));

            }
        };

        System.out.println("Ordem de inserção");
        for (Map.Entry<String, Livro> livro2 : livros2.entrySet()) {
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
        }
        System.out.println("----------------------------------------");

        Map<String, Livro> livros3 = new TreeMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
                put("Duhigg, Charles", new Livro("O poder do hábito", 408));
                put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));

            }
        };

        System.out.println("Ordem alfabetica de autores");
        for (Map.Entry<String, Livro> livro3 : livros3.entrySet()) {
            System.out.println(livro3.getKey() + " - " + livro3.getValue().getNome());
        }
        System.out.println("----------------------------------------");

        System.out.println("Ordem alfabetica dos livros");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNome());
        livros4.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> livro4 : livros4) {
            System.out.println(livro4.getKey() + " - " + livro4.getValue().getNome());
        }
        System.out.println("----------------------------------------");
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> o1, Entry<String, Livro> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }

}