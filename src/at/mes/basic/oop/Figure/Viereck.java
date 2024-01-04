package at.mes.basic.oop.Figure;

public class Viereck extends Figure{
    private float breite;

    public Viereck(float laenge, String name, float breite) {
        super(laenge, name);
        this.breite = breite;
    }

    @Override
    public void getArea() {
        float A = super.getLaenge() * breite;
        System.out.println("Der Flächeninhalt des Vierecks beträgt: " + A);
    }

    public float getBreite() {
        return breite;
    }

    public void setBreite(float breite) {
        this.breite = breite;
    }
}
