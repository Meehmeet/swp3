package at.mes.basic.oop.Handy;

public class SIM {
    private int id;
    private String number;

    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public void doCall(String callnumber){
        System.out.println("Ich rufe diese nummer an: " + callnumber);
    }

    public void sim(){
        System.out.println("Das ist meine id: " + id + " und das ist meine Nummer: " + number);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
