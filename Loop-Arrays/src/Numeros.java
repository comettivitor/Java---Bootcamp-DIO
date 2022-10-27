import java.util.Random;

public class Numeros {
    public void numerosAleatorios(){
        Random random = new Random();

        int[] numeros = new int[5];

        //Armazena numero aleatório no array
        for(int i = 0; i < numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }
        //Mostra valores do array
        System.out.println("Numeros aleatórios: ");
        for(int numero : numeros){
            System.out.println(numero + " ");
        }

        //Mostra numero antecessor
        System.out.println("Numeros antecessores: ");
        for(int numero : numeros){
            System.out.println(numero-1 + " ");
        }

        //Mostra numero sucessor
        System.out.println("Numeros sucessores: ");
        for(int numero : numeros){
            System.out.println(numero+1 + " ");
        }
    }
}
