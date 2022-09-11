import java.util.Scanner;

public class Aufgabe235 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int eingabe = scan.nextInt();

        if (eingabe == 0 || eingabe > 1)
            System.out.print(eingabe + " bottles of rum");
        else if (eingabe == 1)
            System.out.print(eingabe + " bottle of rum");
        else if (eingabe < 0)
            System.out.print("Fehler");
        }

}

