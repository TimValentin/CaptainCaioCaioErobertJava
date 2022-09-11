import java.util.Scanner;

public class Aufgabe233 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int zahl1 = scan.nextInt() % 100;
        int zahl2 = scan.nextInt() % 100;

        int zahl1Ziffer1 = zahl1 / 10;
        int zahl1Ziffer2 = zahl1 % 10;

        int zahl2Ziffer1 = zahl2 / 10;
        int zahl2Ziffer2 = zahl2 % 10;

        if (zahl1Ziffer1 == zahl2Ziffer1
                || zahl1Ziffer1 == zahl2Ziffer2
                || zahl1Ziffer2 == zahl2Ziffer1
                || zahl1Ziffer2 == zahl2Ziffer2)
            System.out.println("Die Zahlen haben eine gemeinsame Ziffer");
    }
}
