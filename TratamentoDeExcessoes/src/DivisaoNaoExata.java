public class DivisaoNaoExata extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoNaoExata(String message, int numerador, int denominador){
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
