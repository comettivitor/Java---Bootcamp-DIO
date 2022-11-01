public class ExSmartTV {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        // smartTv.desligar();
        // System.out.println("Alteração de status - TV ligada? " + smartTv.ligada);

        // smartTv.aumentarVolume();
        // System.out.println("Volume atual: " + smartTv.volume);

        // smartTv.diminuirVolume();
        // System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(18);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
