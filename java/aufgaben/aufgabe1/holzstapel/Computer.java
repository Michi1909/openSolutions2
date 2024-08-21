package aufgaben.aufgabe1.holzstapel;
public class Computer extends AbstrakterSpieler{
    public Computer(String name, Holzstapel holzstapel) {
        super(name, holzstapel);
    }
    public int ziehe(){
        int n = optimalerZug();
        stapel.nimm(n);
        return n;
    }
    public String gewinnMeldung(){
        return toString()+" hat gewonnen!";
    }
    private int optimalerZug(){
        int anzahl = stapel.anzahlHoelzer();
        int zug = anzahl % 4;
        if (zug == 0)zug = 1;
        return zug;
    }
}