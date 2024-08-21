package aufgaben.aufgabe1.holzstapel;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Keyboard {
    private static Scanner input = new Scanner(System.in);

    private static void prompt(String txt) {
        System.out.print(txt + ": ");
    }

    public static int readInt(String prompt) {
        while (true) {
            try {
                prompt(prompt);
                return input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.err.println("\nBitte eine ganze Zahl eingeben!");
            }
        }
    }


    public static double readDouble(String prompt) {
        while (true) {
            try {
                prompt(prompt);
                return input.nextDouble();
            } catch (InputMismatchException e) {
                input.nextLine();
                System.err.println("\nBitte eine Gleitkommazahl eingeben!");
            }
        }
    }

    /*
     * Für den Zweck der yes/no (ja/nein) Eingabe werden unterschiedliche
     * Synonyme in der Map yesNo gespeichert.
     */
    private static Map<String, Boolean> yesNo =
            new HashMap<String, Boolean>();
    static {
        yesNo.put("yes", Boolean.TRUE);
        yesNo.put("y", Boolean.TRUE);
        yesNo.put("ja", Boolean.TRUE);
        yesNo.put("j", Boolean.TRUE);
        yesNo.put("no", Boolean.FALSE);
        yesNo.put("n", Boolean.FALSE);
        yesNo.put("nein", Boolean.FALSE);
    }

    public static boolean readYesNo(String prompt) {
        while (true) {
            Boolean b = yesNo.get(readString(prompt));
            if (b != null)
                return b.booleanValue();
            else
                System.err
                        .println("\nBitte eine ja/nein-, yes/no-Antwort eingeben!");
        }
    }


    public static String readString(String prompt) {
        prompt(prompt);
        return input.next();
    }
}