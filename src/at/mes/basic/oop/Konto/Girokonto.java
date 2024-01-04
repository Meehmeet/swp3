package at.mes.basic.oop.Konto;

public class Girokonto extends Konto{

    private float limit;
    public Girokonto(float kontostand, float limit) {
        super(kontostand);
        this.limit = limit;
    }

    @Override
    public void auszahlen(float Betrag) {
        float Kontostandneu = super.getKontostand() - Betrag;
        if(Betrag < 0){
            System.out.println("Dein Betrag kann nicht negativ sein.");
        }
        else{
            if(Kontostandneu < (limit * (-1))){
                System.out.println("Du kannst nicht mehr als dein Limit auszahlen.");
            }
            else{
                System.out.println("Dein Kontostand beträgt: " + Kontostandneu);
            }
        }
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }
}
