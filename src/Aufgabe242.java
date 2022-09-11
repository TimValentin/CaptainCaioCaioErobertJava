import java.util.Scanner;

public class Aufgabe242 {
    public static void main(String[] args) {
        double input;
        long output;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Gebe die Menge in Litern an: \n");
        input = scan.nextDouble();

        if (input >= 1.0){
            output = (long) input;
            System.out.printf("%d Liter", output);
        }else if (input >= 0.1){
            input *= 100;
            output = (long) input;
            System.out.printf("%d Zentiliter",output);
        }else if (input >= 0.001){
            input *= 1000;
            output = (long) input;
            System.out.printf("%d Milliliter",output);
        }else
            System.out.printf("Eingabe zu klein");
    }
}
