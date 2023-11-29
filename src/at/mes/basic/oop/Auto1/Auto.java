package at.mes.basic.oop.Auto1;

import java.util.ArrayList;

public class Auto {
    private int iLeistung = 0;
    private String sFarbe = "Keine Farbe";
    private Fahrrad kofferraum;

    private ArrayList<Getraenkekiste>kofferraumGetraenkekiste = new ArrayList<Getraenkekiste>();
    public Auto() {
    }

    public Auto(int iLeistung, String sFarbe) {
        this.iLeistung = iLeistung;
        this.sFarbe = sFarbe;
        this.kofferraumGetraenkekiste = new ArrayList<>();
    }

    public Fahrrad getKofferraum() {
        return kofferraum;
    }

    public void setKofferraum(Fahrrad kofferraum) {
        this.kofferraum = kofferraum;
    }


    public void addGetraenke(Getraenkekiste Getraenke){
        this.kofferraumGetraenkekiste.add(Getraenke);
    }


    public ArrayList<Getraenkekiste> getKofferraumGetraenkekiste() {
        return kofferraumGetraenkekiste;
    }

    public void setKofferraumGetraenkekiste(Getraenkekiste kofferraumGetraenkekiste) {
        this.kofferraumGetraenkekiste.add(kofferraumGetraenkekiste);
    }

    public int getiLeistung() {
        return iLeistung;
    }

    public void setiLeistung(int iLeistung) {
        this.iLeistung = iLeistung;
    }

    public String getsFarbe() {
        return sFarbe;
    }

    public void setsFarbe(String sFarbe) {
        this.sFarbe = sFarbe;
    }
}
