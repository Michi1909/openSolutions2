package aufgaben.round1.praktikum.praktikum2;



public abstract class AbstrakerSpieler {
    protected final Holzstapel stapel;
    private final String name;

    public AbstrakerSpieler(String name, Holzstapel stapel) {
        this.name = name;
        this.stapel = stapel;
    }

    public String toString() {
        return "Name: "+ getName();
    }
    public String getName() {
        return name;
    }
    public abstract int ziehe();
    public abstract String gewinnMeldung();
}
