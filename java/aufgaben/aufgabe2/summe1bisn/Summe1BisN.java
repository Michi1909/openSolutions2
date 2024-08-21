package aufgaben.aufgabe2.summe1bisn;

public class Summe1BisN {
    public static void main(String[] args) {
        System.out.println("Die Summe von 1 bis 4 ist "+ summe1bisN(4));
        System.out.println("Die Summe von 1 bis -4 ist "+ summe1bisN(-4));
    }
    public static int summe1bisN(int n) throws IllegalArgumentException{
        if(n<0){
            throw new IllegalArgumentException(n+" muss > 0 sein!");
        }
        int summe = 1;
        for(int i = 1; i <= n; i++){
            summe *= i;
        }
        return summe;
    }
}
