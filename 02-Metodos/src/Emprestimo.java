public class Emprestimo {
    
    public static double taxaUmaParcela(){
        return 0.5;
    }

    public static double taxaCincoParcelas(){
        return 0.7;
    }

    public static double taxaDezParcelas(){
        return 1.0;
    }

    public static void calcular(int valor, int parcelas){
        if(parcelas == 1){
            double valorRecalculado = valor + (valor * taxaUmaParcela());
            System.out.println("Valor total a pagar: " + valorRecalculado);
        }else if(parcelas > 1 && parcelas<=5){
            double valorRecalculado = valor + (valor * taxaCincoParcelas());
            System.out.println("Valor total a pagar: " + valorRecalculado);
        }else if(parcelas > 5 && parcelas <= 10){
            double valorRecalculado = valor + (valor * taxaDezParcelas());
            System.out.println("Valor total a pagar: " + valorRecalculado);
        }
    }
}
