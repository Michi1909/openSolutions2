package aufgaben.aufgabe1.holzstapel;

import java.util.Scanner;

public class Mensch extends AbstrakterSpieler {


    public Mensch(String name, Holzstapel stapel) {
        super(name, stapel);
    }

    /**
     * Laesst den Menschen einen Zug machen.
     * Die Anzahl der Hoelzer wird erfragt. Bei fehlerhafter Eingabe wird
     * erneut nachgefragt.
     * Schliesslich wird die angegebene Anzahl Hoelzer vom Stapel entfernt.
     *
     * @return Die Anzahl der Hoelzer die genommen wurden.
     */
    public int ziehe() {
        Scanner sc = new Scanner(System.in);
        int anzahl=0;
        boolean tmp = false;
        System.out.println("Wieviele Hölzer willst du ziehen?");
        while (tmp == false) {
            System.out.println("Gib deine Anzahl ein:");
            anzahl = sc.nextInt();
            if(stapel.istLegal(anzahl)){
                tmp=true;
                stapel.nimm(anzahl);
            }else{System.out.println("Anzahl war nicht legal!");}
        }
        return anzahl;
    }

    public String gewinnMeldung()
    { return toString() + " hast gewonnen!";}

}
