package at.mes.basic.oop.Rechner;

public class Rechner {
    private float zahl1;
    private float zahl2;

    public Rechner(float zahl1, float zahl2) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    public void addieren(){
        float summe = zahl1 + zahl2;
        System.out.println("Die Summe der Zahlen ist: " + summe);
    }

    public void subtrahieren(){
        float differenz = zahl1 - zahl2;
        System.out.println("Die Differenz der Zahlen ist: " + differenz);
    }

    public void multiplizieren(){
        float produkt = zahl1 * zahl2;
        System.out.println("Das Produkt der Zahlen ist: " + produkt);
    }

    public void dividieren(){
        float quotient = zahl1 / zahl2;
        System.out.println("Der Quotient der Zahlen ist: " + quotient);
    }


    public float getZahl1() {
        return zahl1;
    }

    public void setZahl1(float zahl1) {
        this.zahl1 = zahl1;
    }

    public float getZahl2() {
        return zahl2;
    }

    public void setZahl2(float zahl2) {
        this.zahl2 = zahl2;
    }
}
