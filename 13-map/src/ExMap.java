import java.util.*;

public class ExMap {
    public static void main(String[] args) throws Exception {
        Map<String, Double> carros = new HashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.3);
                put("hb20", 14.8);
            }
        };
        System.out.println(carros);
        System.out.println("");

        System.out.println("substituir valores");
        carros.put("gol", 15.2);
        System.out.println(carros);
        System.out.println("");

        System.out.println("pesquisa no objeto");
        System.out.println(carros.containsKey("mobi"));
        System.out.println("");

        System.out.println("retorna consumo de um item do objeto");
        System.out.println(carros.get("uno"));
        System.out.println("");

        System.out.println("exibe modelos");
        System.out.println(carros.keySet());
        System.out.println("");

        System.out.println("exibe consumo");
        System.out.println(carros.values());
        System.out.println("");

        System.out.println("exibe maior valor");
        Double valorMax = Collections.max(carros.values());
        System.out.println(valorMax);
        System.out.println("");

        System.out.println("Exibe modelo mais eficiente");
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(valorMax)) {
                modeloEficiente = entry.getKey();
                System.out.println(modeloEficiente + " - " + valorMax);
            }
        }
        System.out.println("");

        System.out.println("exibe menor valor");
        Double valorMin = Collections.min(carros.values());
        System.out.println(valorMin);
        System.out.println("");

        System.out.println("exibe modelo menos eficiente");
        Set<Map.Entry<String, Double>> entries2 = carros.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry2 : entries2) {
            if (entry2.getValue().equals(valorMin)) {
                modeloMenosEficiente = entry2.getKey();
                System.out.println(modeloMenosEficiente + " - " + valorMin);
            }
        }
        System.out.println("");

        System.out.println("exibe soma dos consumos");
        Iterator<Double> it = carros.values().iterator();
        Double soma = 0d;

        while (it.hasNext()) {
            soma += it.next();
        }
        System.out.println(soma);
        System.out.println("");

        System.out.println("exibe media dos consumos");
        System.out.println(soma / carros.size());
        System.out.println("");

        System.out.println("remove itens com consumo igual a 15,6");
        Iterator<Double> it2 = carros.values().iterator();

        while (it2.hasNext()) {
            if (it2.next().equals(15.6)) {
                it2.remove();
            }
        }

        System.out.println(carros);
        System.out.println("");

        System.out.println("exibe em ordem alfabetica");
        Map<String, Double> carros2 = new TreeMap<>(carros);
        System.out.println(carros2.toString());

        System.out.println("limpa conjunto");
        carros.clear();
        System.out.println("");

        
    }
}
