package at.mes.basic.oop.Auto1;

import at.mes.basic.oop.Auto1.Auto;
import at.mes.basic.oop.Auto1.Fahrrad;
import at.mes.basic.oop.Auto1.Flasche;
import at.mes.basic.oop.Auto1.Getraenkekiste;

public class testit {
    public static void main(String[] args) {
        Flasche flasche = new Flasche("CocaCola", 500,"Cola");
        Flasche flasche1 = new Flasche("voüs", 330, "Cola");
        Getraenkekiste getraenkekiste = new Getraenkekiste(24, flasche);
        Getraenkekiste getraenkekiste1 = new Getraenkekiste(10,flasche1);
        Auto auto = new Auto(300,"rot");
        auto.setKofferraumGetraenkekiste(getraenkekiste);
        Auto auto1 = new Auto();
        auto.setiLeistung(300);
        auto.setsFarbe("rot");

        auto.addGetraenke(getraenkekiste);
        auto.addGetraenke(getraenkekiste1);

        System.out.println(auto.getKofferraumGetraenkekiste().get(2).getFlasche().getHersteller());

        Fahrrad fahrrad = new Fahrrad();

        auto.setKofferraum(fahrrad);

        //System.out.println(auto.getKofferraumGetraenkekiste().getFlasche().getHersteller());
        //auto.getKofferraumGetraenkekiste().



        System.out.println(fahrrad.getRahmengrosse() + " " + fahrrad.getsFarbe());
        System.out.println(auto.getiLeistung());
        System.out.println(auto.getsFarbe());
    }
}
