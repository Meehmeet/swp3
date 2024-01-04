package at.mes.basic.oop.Rechner;

public class Wissenschaftlicher_Rechner extends Rechner{

    //Zahl3 (Hypotenuse, zahl1/2 An/Gegenkathete)
    private float zahl3;

    public Wissenschaftlicher_Rechner(float zahl1, float zahl2, float zahl3) {
        super(zahl1, zahl2);
        this.zahl3 = zahl3;
    }

    public void sinus(){
        double sinus = Math.cos(getZahl2() / zahl3);
        System.out.println("Der Sinus aus den Zahlen (Gegenkathete + Hypotenuse) ist: " + sinus);
    }

    public void cosinus(){
        double cosinus = Math.cos(getZahl1() / zahl3);
        System.out.println("Der Cosinus aus den Zahlen (Ankathete + Hypotenuse) ist: " + cosinus);
    }

    @Override
    public void addieren() {
        float summe = getZahl1() + getZahl2() + zahl3;
        System.out.println("Die Summe der Zahlen ist: " + summe);
    }

    @Override
    public void subtrahieren() {
        float differenz = getZahl1() - getZahl2() - zahl3;
        System.out.println("Die Differenz der Zahlen ist: " + differenz);
    }

    @Override
    public void multiplizieren() {
        float produkt = getZahl1() * getZahl2() * zahl3;
        System.out.println("Das Produkt der Zahlen ist: " + produkt);
    }

    @Override
    public void dividieren() {
        float quotient = getZahl1() / getZahl2() / zahl3;
        System.out.println("Der Quotient der Zahlen ist: " + quotient);
    }

    public float getZahl3() {
        return zahl3;
    }

    public void setZahl3(float zahl3) {
        this.zahl3 = zahl3;
    }
}
