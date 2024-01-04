package at.mes.basic.oop.Konto;

public class Sparbuch extends Konto{
    public Sparbuch(float kontostand) {
        super(kontostand);
    }

    @Override
    public void auszahlen(float Betrag) {
        float Kontostandneu = super.getKontostand() - Betrag;
        if(Betrag < 0){
            System.out.println("Dein Betrag kann nicht negativ sein.");
        }
        else{
            if(Kontostandneu >= 0){
                System.out.println("Dein neuer Kontostand beträgt: " + Kontostandneu);
            }
            else{
                System.out.println("Dein Kontostand kann nicht negativ sein.");
            }
        }
    }
}
