package aufgaben.aufgabe1.holzstapel;
public class Holzstapel {
    private int anzahlHoelzer;
    private Holzstapel(int anzahlHoelzer) {
        this.anzahlHoelzer = anzahlHoelzer;
    }
    public static Holzstapel neuerHolzstapel(int anzahlHoelzer) {
        return new Holzstapel(anzahlHoelzer);
    }
    public int getAnzahlHoelzer() {
        return anzahlHoelzer;
    }
    public boolean istLeer(){
        return anzahlHoelzer == 0;
    }
    public boolean istLegal(int anzahlHoelzer) {
        return anzahlHoelzer > 0 && anzahlHoelzer < 4;
    }
    public void nimm(int anzahlHoelzer) {
        if(istLegal(anzahlHoelzer)){
            this.anzahlHoelzer -= anzahlHoelzer;
        }else{
            System.out.println(anzahlHoelzer+" sind nicht legal!");
        }
    }
}