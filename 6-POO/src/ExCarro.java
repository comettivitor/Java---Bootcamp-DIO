public class ExCarro {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.setCor("Amarelo");
        carro.setModelo("Volvo");
        carro.setCapacidadeTanque(60);

        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(4.99));

        Carro carro2 = new Carro("Cinza", "Toyota", 48);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(4.99));

    }
}
