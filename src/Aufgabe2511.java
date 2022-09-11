import java.util.Scanner;

public class Aufgabe2511 {
    public static void main(String[] args) {
        int width;
        int height;
        int counter = 0;


        System.out.printf("Geben Sie bitte die Größe des Spielfeldes an.%nZuerst die Breite, anschließend die Höhe.%n");
        Scanner scan = new Scanner(System.in);

        width = scan.nextInt();
        height = scan.nextInt();

        while (true){
            for (int i = 0; i < width; i++) {
                System.out.print("_#");
            }
            counter++;
            if (counter >= height)
                break;
            System.out.println();
        }


    }
}
