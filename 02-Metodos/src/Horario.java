public class Horario {

    public static void cumprimento(int hora) {
        if (hora >= 5 && hora <= 11) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Boa noite!");
        }else{
            System.out.println("Tome cuidado pela madrugada!! >:)");
        }
    }
}
