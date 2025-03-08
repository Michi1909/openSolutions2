package aufgaben.round1.uebungsaufgaben.uebungsaufgabe3;

public class Verbrenner extends PKW implements VerbrennerI{
    @Override
    public void tanken(String kraftstoff) {
        System.out.println(
                "\nDas PKW " + this.getModell()
                + " von " + this.getHersteller()
                + " mit Kennzeichen " + this.getKennzeichen()
                + " tankt " + kraftstoff + " ! ");
    }
}
