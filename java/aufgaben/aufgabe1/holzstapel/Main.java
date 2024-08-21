package aufgaben.aufgabe1.holzstapel;

public class Main {


    public static void main(String[] args) {
        /*
         * Erfragt die Spieleinstellungen.
         */
        System.out.println("Nimmspiel");
        int anzahlHoelzer = Keyboard.readInt("Mit wieviel Hoelzern soll begonnen werden");
        boolean computerBeginnt = Keyboard.readYesNo("darf ich anfangen");
        System.out.println();

        /*
         * Erzeugt alle Objekte.
         */
        // TODO: Objekte richtig erzeugen!
        Holzstapel stapel = null;
        AbstrakterSpieler computer = null;
        AbstrakterSpieler mensch = null;

        /*
         * Legt den aktuellen Spieler fest.
         * (dies ist in zunaechst genau der andere Spieler, da in der Schleife
         * sofort der naechste Spieler bestimmt wird.)
         */
        AbstrakterSpieler aktuellerSpieler = computer;
        if (computerBeginnt)
            aktuellerSpieler = mensch;

        /*
         * Reihum muss immer wieder ein anderer Spieler ziehen.
         */
        while (!stapel.istLeer()) {
            // dafuer sorgen, dass ein anderer an die Reihe kommt:
            // wenn Mensch dann Computer und umgekehrt)
            if (aktuellerSpieler == computer)
                aktuellerSpieler = mensch;
            else
                aktuellerSpieler = computer;
            int n = aktuellerSpieler.ziehe();
            System.out.println(
                    aktuellerSpieler + " zieht " + n + ", Rest: " + stapel.anzahlHoelzer());
        }
        System.out.println(aktuellerSpieler.gewinnMeldung());
    }
}
