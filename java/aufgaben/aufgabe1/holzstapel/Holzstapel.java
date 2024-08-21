package aufgaben.aufgabe1.holzstapel;
public class Holzstapel {
    private int anzahlHoelzer;
    private Holzstapel(int anzahlHoelzer) {
        this.anzahlHoelzer = anzahlHoelzer;
    }
    public Holzstapel neuerHolzstapel(int anzahlHoelzer) {

        //TODO
        return new Holzstapel(anzahlHoelzer):

    }
    public int getAnzahlHoelzer() {
        return anzahlHoelzer;
    }
    public boolean istLeer(){
        return anzahlHoelzer == 0;
    }
    public boolean istLegal(int anzahlHoelzer) {
        //TODO
        return anzahlHoelzer == anzahlHoelzer;
    }
    public void nimm(int anzahlHoelzer) {
        //TODO
        this.anzahlHoelzer -= anzahlHoelzer;
    }
}