public class OutOfBounds extends Exception{
    private int numerador;
    private int denominador;

    public OutOfBounds(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public OutOfBounds(String message, Object object, Object object2) {
    }
    
}
