package at.mes.basic.oop.Figure;

public class Figuretest {
    public static void main(String[] args) {
        Quadrat q1 = new Quadrat(5,"Quadrat");
        Viereck v1 = new Viereck(5,"Viereck",4);
        Wuerfel w1 = new Wuerfel(4, "Würfel");
        Kreis k1 = new Kreis("Kreis", 3);

        q1.getArea();
        q1.getName1();

        v1.getArea();
        v1.getName1();

        w1.getArea();
        w1.getName1();

        k1.getArea();
        k1.getName1();
    }
}
