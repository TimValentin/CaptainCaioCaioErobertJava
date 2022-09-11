import java.util.Scanner;

public class Aufgabe257ZweiterVersuch {
    public static void main(String[] args){
        long input;
        int faktorial = 1;

        Scanner scan = new Scanner(System.in);
        input = scan.nextLong();


        for (faktorial = 1; input > 1; faktorial++){
            if (input % faktorial == 0)
                input /= faktorial;
            else
                break;
        }

        if (input == 1)
            System.out.printf("n! = %d",faktorial);
        else
            System.out.printf("%d ist keine Fakultät",input);
    }
}


