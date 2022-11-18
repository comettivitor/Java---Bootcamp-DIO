import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprimir todos os numeros");
        numbers.stream().forEach(n -> System.out.println(n)); // Lambda expressions
        // numbers.stream().forEach(System.out::println); //Reference method
        System.out.println("-------------------------------------");

        System.out.println("Por 5 primeiros numeros e por em Set");
        numbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("Transformar lista de string em int");
        List<Integer> x = numbers.stream()
                // .map(n3 -> Integer.parseInt(n3));
                .map(Integer::parseInt)
                .collect(Collectors.toList());
                // .forEach(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("Pegar numeros pares maiores que 2 e por em uma lista");
        numbers.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("Mostrar media dos numeros");
        numbers.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .ifPresent(System.out::println);
        System.out.println("-------------------------------------");

        System.out.println("Remove numeros impares");
        x.removeIf(i -> (i % 2 != 0));
        System.out.println(x);
    }
}
