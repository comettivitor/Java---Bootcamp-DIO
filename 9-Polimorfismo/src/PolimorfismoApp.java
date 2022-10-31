public class PolimorfismoApp {
    public static void main(String[] args) throws Exception {
        ClasseMae[] classes = new ClasseMae[]{
            new ClasseFilha1(),
            new ClasseFilha2(),
            new ClasseMae()
        };

        //Sobreescrita com polimorfismo, alguns momentos se comportou de forma
        //polimorfica, outros não.
        for(ClasseMae classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        //Polimorfismo
        for(ClasseMae classe: classes){
            classe.metodo2();
        }

        System.out.println("");

        //Sobreescrita pura
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }
}
