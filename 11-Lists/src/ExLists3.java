import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExLists3 {
    public static void main(String[] args) {
        List<Temperatura> temperatura = new ArrayList<Temperatura>(){
            {
                add(new Temperatura(15.6, 18.7, 20d, 27.9, 30.4,12.6));
            }
        };

        for(Temperatura temp: temperatura){
            System.out.println(temp);
        }
    }
}

class Temperatura implements Comparable<Temperatura>{
    private double jan;
    private double fev;
    private double mar;
    private double abr;
    private double mai;
    private double jun;

    public Temperatura() {

    }

    public Temperatura(double jan, double fev, double mar, double abr, double mai, double jun) {
        this.jan = jan;
        this.fev = fev;
        this.mar = mar;
        this.abr = abr;
        this.mai = mai;
        this.jun = jun;
    }

    public double getJan() {
        return jan;
    }

    public void setJan(double jan) {
        this.jan = jan;
    }

    public double getFev() {
        return fev;
    }

    public void setFev(double fev) {
        this.fev = fev;
    }

    public double getMar() {
        return mar;
    }

    public void setMar(double mar) {
        this.mar = mar;
    }

    public double getAbr() {
        return abr;
    }

    public void setAbr(double abr) {
        this.abr = abr;
    }

    public double getMai() {
        return mai;
    }

    public void setMai(double mai) {
        this.mai = mai;
    }

    public double getJun() {
        return jun;
    }

    public void setJun(double jun) {
        this.jun = jun;
    }

    @Override
    public int compareTo(Temperatura temp) {
        return 0;
    }

    @Override
    public String toString(){
        return "Temperatura {jan = " + jan + 
                ", fev = " + fev + 
                ", mar = " + mar + 
                ", abr = " + abr + 
                ", mai = " + mai + 
                ", jun = " + jun + "}";
    }

}