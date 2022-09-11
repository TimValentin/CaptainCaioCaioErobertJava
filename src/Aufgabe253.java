import java.util.Scanner;

public class Aufgabe253 {
    public static void main(String[] args) {
        long input = 0;
        long beute = 0;


        Scanner scan = new Scanner(System.in);

        while (true){
            input = scan.nextLong();
            beute += input;
            if (input == 0)
                break;
        }

        System.out.print(beute);
    }
}
