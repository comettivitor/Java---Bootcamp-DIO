import java.util.Random;

public class Matriz {
    public void geraMatriz(){
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for(int[] linha : matriz){
            for(int coluna : linha){
                System.out.println(coluna);
            }
            System.out.println();
        }
    }
}
