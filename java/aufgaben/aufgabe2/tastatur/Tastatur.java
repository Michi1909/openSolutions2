package aufgaben.aufgabe2.tastatur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tastatur {

    static BufferedReader sE = new BufferedReader( new InputStreamReader(System.in));
    public static int readInt (String prompt){
        while(true){
            System.out.print(prompt);
            try{
                String zeile = sE.readLine();
                int i = Integer.parseInt(zeile);
                if(i<0)throw new NumberFormatException();
                return i;
            }
            catch(NumberFormatException e){
                System.out.println("Bitte eine ganze Zahl eingeben!");
            }
            catch(IOException e){
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
