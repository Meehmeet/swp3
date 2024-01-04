package at.mes.basic.oop.Figure;

public class Wuerfel extends Figure{

    public Wuerfel(float laenge, String name) {
        super(laenge, name);
    }

    @Override
    public void getArea() {
        float A = super.getLaenge() * super.getLaenge() * 6;
        System.out.println("Der Flächeninhalt des Würfels beträgt: " + A);
    }
}
