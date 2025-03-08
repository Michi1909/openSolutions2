package aufgaben.round1.praktikum.praktikum2;

public abstract class AbstrakterSpieler {
    protected final Holzstapel stapel;
    private final String name;
    public AbstrakterSpieler(String name, Holzstapel stapel){
        this.name = name;
        this.stapel = stapel;
    }
    public abstract int ziehe();
    public abstract String gewinnMeldung();
}