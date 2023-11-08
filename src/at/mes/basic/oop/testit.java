package at.mes.basic.oop;

public class testit {
    public static void main(String[] args) {
        Flasche flasche = new Flasche("CocaCola", 500,"Cola");
        Getraenkekiste getraenkekiste = new Getraenkekiste(24, flasche);
        Auto auto = new Auto(300,"rot");
        auto.setKofferraumGetraenkekiste(getraenkekiste);
        Auto auto1 = new Auto();
        auto.setiLeistung(300);
        auto.setsFarbe("rot");

        Fahrrad fahrrad = new Fahrrad();

        auto.setKofferraum(fahrrad);
        Flasche flasche1 = new Flasche("voüs", 330, "Cola");
        //System.out.println(auto.getKofferraumGetraenkekiste().getFlasche().getHersteller());
        //auto.getKofferraumGetraenkekiste().

        System.out.println(fahrrad.getRahmengrosse() + " " + fahrrad.getsFarbe());
        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe());
    }
}
