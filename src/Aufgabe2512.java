import java.util.Scanner;

public class Aufgabe2512 {
    public static void main(String[] args){
        double input;
        double yLenghtD;
        int yLenght;
        int x = 0;
        int xLenght;
        int sLenght;
        int s = 0;
        int stars = 0;

        Scanner scan = new Scanner(System.in);

        input = scan.nextInt();
        yLenghtD = input / 2 + 0.5;
        yLenght = (int)yLenghtD;
        xLenght = (int)yLenghtD;


        for (int y = 1; y < yLenght + 1; y++){
            while (x < xLenght){
                System.out.print(" ");
                x++;
            }
            x = 0;
            xLenght--;

            sLenght = y + stars;
            for (s = 0; s < sLenght; s++)
                System.out.print("*");

            if (x != xLenght)
                System.out.println();

            s = 0;
            stars++;
        }

    }
}


