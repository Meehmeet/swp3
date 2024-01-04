package at.mes.basic.oop.Rechner;

public class Rechnertest {
    public static void main(String[] args) {
        Rechner r1 = new Rechner(10,10);
        Wissenschaftlicher_Rechner wsr1 = new Wissenschaftlicher_Rechner(10,10,10);
        Wurzelrechner wr1 = new Wurzelrechner(10,10);

        r1.addieren();
        r1.subtrahieren();
        r1.multiplizieren();
        r1.dividieren();

        wsr1.addieren();
        wsr1.sinus();
        wsr1.cosinus();

        wr1.addieren();
        wr1.wurzel();
    }
}
