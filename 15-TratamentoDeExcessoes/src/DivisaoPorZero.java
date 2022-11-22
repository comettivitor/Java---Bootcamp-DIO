public class DivisaoPorZero extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoPorZero(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
}
