import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
    public static void main(String[] args) {

        Map<String, Estado> estados = new HashMap<>() {
            {
                put("PE", new Estado(9616621));
                put("AL", new Estado(3351543));
                put("CE", new Estado(9187103));
                put("RN", new Estado(3534265));
            }
        };
        System.out.println("Relação de estados");
        for (Map.Entry<String, Estado> estado : estados.entrySet()) {
            System.out.println("Estado: " + estado.getKey() + " - População = " + estado.getValue().getPopulacao());
        }
        System.out.println("----------------------------------------");
        System.out.println("Altera população de RN");
        for (Map.Entry<String, Estado> estado2 : estados.entrySet()) {
            estados.put("RN", new Estado(3534165));
            System.out.println("Estado: " + estado2.getKey() + " - População = " + estado2.getValue().getPopulacao());
        }
        System.out.println("----------------------------------------");
    }
}

class Estado {
    private int populacao;

    public Estado(int populacao) {
        this.populacao = populacao;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + populacao;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estado other = (Estado) obj;
        if (populacao != other.populacao)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Estado [populacao=" + populacao + "]";
    }

}