import java.util.Scanner;

public class Aufgabe2515 {
    public static void main(String[] args) {

        int[] nA = new int[10];
        int[] nZiffernA = new int[10];

        int nInput;
        int nZiffern = 2;

        int counter = 10;


        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < nA.length; i++) {
           System.out.printf("Gebe bitte Zahlen mit maximal 9 Ziffern ein:%n");
           nInput = scan.nextInt();
           if (nInput == 0)
               break;
           nA[i] = nInput;
           counter--;
       }


        for (int i = 0; i < nA.length - counter; i++) {

            for (int nTeiler = 10; nTeiler < nA[i]; nTeiler *= 10) {
                nZiffern++;
            }
            nZiffernA[i] = nZiffern - 1;
            nZiffern = 2;

        }


        for (int i = 0; i < nA.length - counter; i++) {

            for (int j = 0; j < 10 - nZiffernA[i]; j++) {
                System.out.printf(" ");
            }
            System.out.printf("%d -> %d%n", nA[i], nZiffernA[i]);

        }
    }
}
