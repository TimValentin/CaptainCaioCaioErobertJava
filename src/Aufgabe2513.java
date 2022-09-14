import java.util.Scanner;

public class Aufgabe2513 {
    public static void main(String[] args) {
        int repetitions;
        int x = 0;


        Scanner scan = new Scanner(System.in);
        repetitions = scan.nextInt();

        for (int y = 0; y < repetitions; y++) {
            while (x < repetitions) {
                System.out.print("><> ");
                x++;
            }
            x = 0;

            while (x < repetitions){
                System.out.print("<>< ");
                x++;
            }
            x = 0;
            System.out.println();
        }
    }
}
