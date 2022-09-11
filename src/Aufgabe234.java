import java.util.Scanner;

public class Aufgabe234 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double eingabe = scan.nextDouble();

        int euro2 = (int) (eingabe / 2);

        double rest = eingabe % 2;
        int euro1 = (int) (rest);

        rest %= 1;
        int cent50 = (int) (rest / 0.5);

        rest %= 0.5;
        int cent20 = (int) (rest / 0.2);

        rest %= 0.2;
        int cent10 = (int) (rest / 0.1);

        rest %= 0.1;
        int cent5 = (int) (rest / 0.05);

        rest %= 0.05;
        int cent2 = (int) (rest / 0.02);

        rest %= 0.02;
        int cent1 = (int) (rest / 0.01);

        rest %= 0.01;

        System.out.println(euro2 + " x 2 €");
        System.out.println(euro1 + " x 1 €");
        System.out.println(cent50 + " x 50 Cent");
        System.out.println(cent20 + " x 20 Cent");
        System.out.println(cent10 + " x 10 Cent");
        System.out.println(cent5 + " x 5 Cent");
        System.out.println(cent2 + " x 2 Cent");
        System.out.println(cent1 + " x 1 Cent");

    }
}
