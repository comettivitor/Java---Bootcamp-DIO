import javax.swing.*;

public class Excessoes {
    public static void main(String[] args) throws Exception {
        int[] numerador = { 4, 5, 8, 10 };
        int[] denominador = { 2, 4, 0, 2, 8 };

        for (int i = 0; i < denominador.length; i++) {
            try {
                if (numerador[i] % 2 != 0) {
                    throw new DivisaoNaoExata("Divisão não exata", numerador[i], denominador[i]);
                }else if (denominador[i] == 0){
                    throw new DivisaoPorZero("Devisão por zero", numerador[i], denominador[i]);
                }else if (numerador.length != denominador.length){
                    throw new OutOfBounds("Array numerador menor que array denominador", numerador[i], denominador[i]);
                }
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExata ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, ex.getMessage(), null, i);
            }catch(DivisaoPorZero ex2){
                ex2.printStackTrace();
                JOptionPane.showMessageDialog(null, ex2.getMessage(), null, i);
            }catch(OutOfBounds ex3){
                ex3.printStackTrace();
                JOptionPane.showMessageDialog(null, ex3.getMessage(), null, i);
            }
        }
    }
}
