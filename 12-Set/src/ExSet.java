import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExSet {
    public static void main(String[] args) throws Exception {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 0.5, 9.3, 7.9, 0d));
        
        System.out.println("Conferir se tem nota no conjunto");
        System.out.println(notas.contains(7d));
        System.out.println(" ");

        System.out.println("Exibindo menor nota");
        System.out.println(Collections.min(notas));
        System.out.println(" ");

        System.out.println("Exibindo maior nota");
        System.out.println(Collections.max(notas));
        System.out.println(" ");

        System.out.println("Exibindo soma das notas");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println(" ");

        System.out.println("Media das notas");
        System.out.println(soma / notas.size());
        System.out.println(" ");

        System.out.println("Remove notas 0");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Remover notas menores que 7");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next <7){
                iterator2.remove();
            }
        }
        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Exibe as notas em ordem crescente");
        Set<Double> notas2 = new TreeSet<>(notas);
        System.out.println(notas2);
        System.out.println(" ");

        System.out.println("remover todo o conjunto");
        notas.clear();
        System.out.println(notas.isEmpty());
    }
}
