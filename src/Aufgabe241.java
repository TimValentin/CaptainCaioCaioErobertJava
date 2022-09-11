import java.util.Scanner;

public class Aufgabe241 {
    public static void main(String[] args) {
        int uhr = 1000;
        double input;


        Scanner scan = new Scanner(System.in);

        System.out.printf("Gebe den Betrag ein, welchen du für die Uhr bezahlen möchtest VHB 1000€ \n");
        input = scan.nextDouble();

        if (input >= (uhr * 0.9) && input < (uhr * 1.2))
            System.out.printf("Good boy!");
        else
            System.out.printf("You son of a bitch!");
    }
}
