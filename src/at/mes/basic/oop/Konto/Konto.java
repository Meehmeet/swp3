package at.mes.basic.oop.Konto;

public class Konto {
    private float Kontostand;

    public Konto(float kontostand) {
        Kontostand = kontostand;
    }

    public void einzahlen(float Betrag){
        Kontostand = Kontostand + Betrag;
        if(Betrag < 0){
            System.out.println("Dein Betrag kann nicht negativ sein.");
        }
        else{
            System.out.println("Dein neuer Kontostand beträgt: " + Kontostand);
        }
    }

    public void auszahlen(float Betrag){
        Kontostand = Kontostand - Betrag;
        if(Betrag < 0){
            System.out.println("Dein Betrag kann nicht negativ sein.");
        }
        else{
            System.out.println("Dein neuer Kontostand beträgt: " + Kontostand);
        }
    }

    private void saldo(){
        System.out.println("Das Saldo vom ausgewählten Konto ist: " + Kontostand);
    }


    public float getKontostand() {
        return Kontostand;
    }

    public void setKontostand(float kontostand) {
        Kontostand = kontostand;
    }
}
