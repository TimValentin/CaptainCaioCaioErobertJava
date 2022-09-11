import java.util.Arrays;
import java.util.Scanner;

public class Aufgabe246 {
    public static void main(String[] args) {
        String[] zeichenkette = {"Ay", "Ay, ay", "Ein Ei", "yes", "ja"};
        String[] eingabe = {"", "", "", "", ""};


        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < eingabe.length; i++)
            eingabe [i] = scan.nextLine();



        if (Arrays.equals(zeichenkette, eingabe))
            System.out.printf("Keep it up!");
        else
            System.out.printf("Don't you dare!");
    }
}
