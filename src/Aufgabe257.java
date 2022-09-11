// Es ist nicht Sinnvoll das so zu machen (benötigt zu viel Rechenleistung, daher sollte man % benutzen.

import java.util.Scanner;

public class Aufgabe257 {
    public static void main(String[] args) {
        long input;
        long faktorial = 1;


        Scanner scan = new Scanner(System.in);
        input = scan.nextLong();
        for (int multiplizierer = 2; multiplizierer < 50 && faktorial != input && faktorial != 0; multiplizierer++) {
            faktorial *= multiplizierer;
            System.out.println(faktorial);
            if (faktorial == input){
                System.out.printf("%d ist n! = %d %n",input, multiplizierer);
                break;
            }
        }

        if (faktorial != input)
            System.out.print("Es gibt keine Übereinstimmung mit einem Faktor bis 50");



    }
}
