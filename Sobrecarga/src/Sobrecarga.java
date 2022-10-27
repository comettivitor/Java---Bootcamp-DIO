public class Sobrecarga {
    public static void quadrado(double lado){
        System.out.println("Área do quadrado = " + lado * lado);
    }

    public static void retangulo(double lado, double lado2){
        System.out.println("Área do retângulo = " + lado * lado2);
    }

    public static void trapezio(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio = " + (baseMaior + baseMenor)*altura);
    }
}
