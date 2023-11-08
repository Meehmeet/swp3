package at.mes.basic.oop;

public class Getraenkekiste {
    private int anzahl;
    private Flasche flasche;

    public Getraenkekiste(int anzahl, Flasche flasche) {
        this.anzahl = anzahl;
        this.flasche = flasche;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public Flasche getFlasche() {
        return flasche;
    }

    public void setFlasche(Flasche flasche) {
        this.flasche = flasche;
    }
}
