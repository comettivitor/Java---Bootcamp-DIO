public class Inverso {
    public void inverteArray(){
        int [] vetor = {15,25,35,45,55,65};

        // for(int i = 0; i < vetor.length; i++){
        //     System.out.println(vetor[i]);
        // }

        for(int j = (vetor.length - 1); j >= 1; j--){
            System.out.println(vetor[j]);
        }
    }
}
