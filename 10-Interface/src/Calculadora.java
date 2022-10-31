public class Calculadora implements OperacoesMatematicas {
    
        @Override
        public void soma(double num1, double num2) {
            System.out.println("soma: " + (num1 + num2));
        }

        @Override
        public void subtracao(double num1, double num2) {
            System.out.println("subtracao: " + (num1 - num2));
        }

        @Override
        public void multiplicacao(double num1, double num2) {
            System.out.println("multiplicacao: " + (num1 * num2));
        }

        @Override
        public void divisao(double num1, double num2) {
            System.out.println("divisao: " + (num1 / num2));
        }
    }

