import java.util.Objects;
import java.util.Scanner;

public class Aufgabe246ZweiterVersuch {
    public static void main(String[] args) {

        String[] zeichenkette = {"Ay", "Ay, ay", "Ein Ei", "yes", "ja"};
        String[] eingabe = {"", "", "", "", ""};

        int counter = 0;


        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < eingabe.length; i++)
            eingabe [i] = scan.nextLine();


        for (int i = 0; i < zeichenkette.length; i++)
            if (Objects.equals(zeichenkette[i], eingabe[i]))
                counter++;



        if (counter == 4)
            System.out.printf("Keep it up!");
        else
            System.out.printf("Don't you dare!");
    }
}

