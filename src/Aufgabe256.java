import java.util.Scanner;

public class Aufgabe256{
    public static void main(String[] args) {
        int input;
        long faktorial = 1;


        Scanner scan = new Scanner(System.in);

        System.out.println("Gebe bitte deine Fakultät ein: ");
        input = scan.nextInt();


        //Faktorial kleiner wie 0
        if (input < 0){
            System.out.print("Negative Eingabe ist nicht zulässig");
        }

        //Berechnung und Ausgabe der Fakultät
        if (input >= 0){
            System.out.printf("%d! = %d ",input,faktorial);
            for (int multiplizierer = 2; multiplizierer <= input; multiplizierer++) {
                faktorial *= multiplizierer;

                System.out.printf("* %d ",multiplizierer);
            }
            System.out.printf("= %d",faktorial);
        }



    }
}

