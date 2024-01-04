package at.mes.basic.oop.Figure;

public class Kreis{

    private float radius;
    private String name;

    public Kreis(String name, float radius) {
        this.name = name;
        this.radius = radius;
    }

    public void getName1(){
        System.out.println("Der Name der Figur ist: " + getName());
    }

    public void getArea() {
        double A = radius * radius * Math.PI;
        System.out.println("Der Flächeninhalt des Kreises beträgt: " + A);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
