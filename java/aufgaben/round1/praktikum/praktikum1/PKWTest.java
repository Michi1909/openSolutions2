package aufgaben.round1.praktikum.praktikum1;

public class PKWTest {
    public static void main(String[] args) {
        Verbrenner p1 = new Verbrenner("XY2", "Bosch", "M KK 1234");
        HybridFahrzeug p2 = new HybridFahrzeug("LL", "Audio", "K SS 1234");
        EAuto p3 = new EAuto("XY2", "BMW", "RE MK 1234");

        testeVerbrennerI(p1, "test1");
        testeEAutoI(p2, "test2");
        testeEAutoI(p3, "test3");
    }

    public static void testeVerbrennerI(VerbrennerI einVerbrenner,
                                       String kraftstoff){
            einVerbrenner.tanken(kraftstoff);
    }
    public static void testeEAutoI(EAutoI einEAuto, String ladeart){
        einEAuto.aufladen(ladeart);
    }
}
