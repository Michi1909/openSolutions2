package aufgaben.aufgabe1.holzstapel;
public abstract class AbstrakterSpieler {
    protected final Holzstapel stapel;
    private final String name;
    public AbstrakterSpieler(String name, Holzstapel stapel){
        this.name = name;
        this.stapel = stapel;
    }
    public abstract int ziehe():
    public abstract String gewinnMeldung();
}