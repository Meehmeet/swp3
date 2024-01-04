package at.mes.basic.oop.Konto;

public class Kontotest {
    public static void main(String[] args) {
        Sparbuch s1 = new Sparbuch(1000);
        Girokonto g1 = new Girokonto(1000,1000);
        Kreditkonto k1 = new Kreditkonto(-3000);

        s1.einzahlen(500);
        s1.auszahlen(200);

        g1.auszahlen(2000);
        g1.auszahlen(2001);

        k1.einzahlen(1000);
        k1.auszahlen(2000);
    }
}
