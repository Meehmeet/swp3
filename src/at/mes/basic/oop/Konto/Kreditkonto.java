package at.mes.basic.oop.Konto;

public class Kreditkonto extends Konto{

    public Kreditkonto(float kontostand) {
        super(kontostand);
    }

    @Override
    public void einzahlen(float Betrag) {
        float Kredit = super.getKontostand() + Betrag;
        if(Betrag < 0){
            System.out.println("Dein Betrag kann nicht negativ sein.");
        }
        else{
            if(Kredit > 0){
                System.out.println("Dein Kredit kann nicht positiv sein.");
            }
            else{
                System.out.println("Dein Kredit beträgt: " + Kredit);
            }
        }
    }
}
