import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExLists {
    public static void main(String[] args) throws Exception {
        //Lista mais convencional
        List<Double> notas = new ArrayList<Double>();
        System.out.println("Lista de Notas");

        //Lista Imutável(não permite adicionar ou remover elementos)
        // List<Double> notas2 = List.of(7d, 6d, 8.5, 3.0);
        
        //adiciona valores a lista
        notas.add(7d);
        notas.add(4d);
        notas.add(4.2);
        notas.add(5.0);
        System.out.println(notas);

        //Verificaposição de elementos no array
        System.out.println("Mostra posição dos valores do array");
        System.out.println(notas.indexOf(4.2));
        System.out.println(notas.indexOf(4d));
        System.out.println(notas.indexOf(7d));
        System.out.println(notas.indexOf(5.0));

        //Subtitui um valor por outro
        notas.set(1, 6.0);

        //Confere se item está na lista (retorna boolean)
        notas.contains(9.0);

        //Imprime itens um abaixo do outro
        System.out.println("Imprime itens da lista um abaixo do outro");
        for(Double nota: notas){
            System.out.println(nota);
        };

        //Retorna valor de indice
        notas.get(2);

        //Exibe menor nota
        System.out.println(Collections.min(notas));

        //Exibe maior nota
        System.out.println(Collections.max(notas));

        //Exibe soma de todos os valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        //Media dos valores
        System.out.println(soma/notas.size());

        //remove nota zero/ remove nota na posição zero
        notas.remove(0d);
        notas.remove(0);

        //remove notas menores que 7
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7){
                iterator2.remove();
            }
        }
        System.out.println(notas);

        //Limpa lista
        notas.clear();

        

    }
}
