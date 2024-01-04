package at.mes.basic.oop.Rechner;

public class Wurzelrechner extends Rechner{
    public Wurzelrechner(float zahl1, float zahl2) {
        super(zahl1, zahl2);
    }

    public void wurzel(){
        double wurzel = Math.sqrt(getZahl1() + getZahl2());
        System.out.println("Die Wurzel aus den zwei Zahlen ist: " + wurzel);
    }
}
