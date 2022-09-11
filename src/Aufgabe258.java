import java.util.Scanner;

public class Aufgabe258 {
    public static void main(String[] args) {


        long input;
        int[] ziffern = new int[20];
        int gZiffer = 0;
        int kZiffer = 9;

        long div = 10;


        Scanner scan = new Scanner(System.in);
        input = Math.abs(scan.nextLong());

        long rest = Math.abs(input);

        //Teiler berechnen
        while (true){
           if (input > div)
               div *= 10;
           else{
               div /= 10;
               break;
           }
       }

        //Ziffern erfassen

        for (int i = 0; rest >= 10; i++) {
            if (rest != input){
                rest %= (div * 10);
            }
            double dZiffer = rest / div;
            ziffern[i] = (int)dZiffer;
            div /= 10;
            input = -1;

            if (ziffern[i] > gZiffer)
                gZiffer = ziffern[i];

            if (ziffern[i] < kZiffer)
                kZiffer = ziffern[i];

            System.out.printf("Ziffer%d = %d %n",i,ziffern[i]);
        }
        if (input == 0)
            kZiffer = 0;

        System.out.printf("Größte Ziffer = %d %nKleinste Ziffer = %d",gZiffer,kZiffer);

    }
}
