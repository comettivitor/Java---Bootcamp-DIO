import java.util.Scanner;

public class NomeIdade {
    Scanner scan = new Scanner(System.in);

    String nome;
    int idade;

    public void verificaNomeIdade() {
        while (true) {
            System.out.println("Pressione '0' para sair.");
            System.out.println("Informe nome: ");
            nome = scan.next();

            if (nome.equals("0")) {
                System.out.println("Processo Cancelado");
                break;
            } else {
                System.out.println("Informe idade: ");
                idade = scan.nextInt();
                System.out.println(nome + " tem " + idade + " anos de idade!");
                System.out.println("Próximo...");
            }
        }
    }
}