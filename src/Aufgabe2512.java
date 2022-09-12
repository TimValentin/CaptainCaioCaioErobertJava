import java.util.Scanner;

public class Aufgabe2512 {
    public static void main(String[] args){
        double input;
        double yLenghtD;
        int yLenght;
        int xLenght;
        int x = 0;
        int stars = 0;

        Scanner scan = new Scanner(System.in);

        input = scan.nextInt();
        yLenghtD = input / 2 + 0.5;
        yLenght = (int)yLenghtD;


        for (int y = 1; y < yLenght + 1; y++){
            xLenght = y + stars;
            for (x = 0; x < xLenght; x++)
                System.out.print("*");

            System.out.println();
            x = 0;
            stars++;
        }


    }
}


