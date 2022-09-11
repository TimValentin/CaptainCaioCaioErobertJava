import java.util.Scanner;

public class Aufgabe232 {
    public static void main(String[] args) {
        int numBottles;
        int numMembers;
        int captain;
        int members;
        int rest;

        Scanner scan = new Scanner(System.in);

        System.out.println("Gebe die Anzahl der Erbeuteten Flaschen ein: ");
        numBottles = scan.nextInt();

        System.out.println("Gebe die Anzahl der Crew Member ein: ");
        numMembers = scan.nextInt();


        members = numBottles / 2 / numMembers;
        captain = numBottles / 2;
        rest = numBottles - members * numMembers - captain;

        System.out.println("Der Captain bekommt: " + captain + " Flaschen.");
        System.out.println("Jeder Crew Member bekommt: " + members + " Flaschen.");

        System.out.print("Es bleiben: " + rest + " Flaschen übrig.");
    }
}
