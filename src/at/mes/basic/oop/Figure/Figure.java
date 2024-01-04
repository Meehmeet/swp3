package at.mes.basic.oop.Figure;

public class Figure {
    private float laenge;
    private String name;

    public Figure(float laenge, String name) {
        this.laenge = laenge;
        this.name = name;
    }

    public void getName1(){
        System.out.println("Der Name der Figur ist: " + getName());
    }

    public void getArea(){
        float A = laenge * laenge;
        System.out.println("Der Flächeninhalt beträgt: " + A);
    }

    public float getLaenge() {
        return laenge;
    }

    public void setLaenge(float laenge) {
        this.laenge = laenge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
