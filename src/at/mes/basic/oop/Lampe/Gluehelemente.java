package at.mes.basic.oop.Lampe;

public class Gluehelemente {
    private String name;
    private String color;
    private double power;
    private boolean state;

    public Gluehelemente(String name, String color, double power, boolean state) {
        this.name = name;
        this.color = color;
        this.power = power;
        this.state = state;
    }

    public void turnOn(){
        if(!state){
           state = true;
            power = power + 5;
        }
        else if(state)
        {
            System.out.println("Mein Name ist " + this.name + ". Ich bin bereits eingeschaltet.");
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
