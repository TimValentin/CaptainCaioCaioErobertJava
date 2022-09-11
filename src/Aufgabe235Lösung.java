import java.util.Scanner;

public class Aufgabe235Lösung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int noOfBottles = scan.nextInt(); // or 0, 1, 99, ...
        System.out.println( noOfBottles + " " + (noOfBottles != 1 ?
                "bottles" : "bottle") + " of rum" );
    }
}
