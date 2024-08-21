
public class Mensch extends AbstrakterSpieler {


    public Mensch(String name, Holzstapel stapel) {
        super(name, stapel);
    }


    public int ziehe() {
        // TODO: gemaess Kommentar fertigstellen.
        return 0; // das ist falsch!
    }

    public String gewinnMeldung()
    { return toString() + " hast gewonnen!";}

}
