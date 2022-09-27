import java.util.Scanner;

public class Aufgabe422DIfferent {

    static void count5PercentJumps() {
        Scanner scan = new Scanner(System.in);

        int[] dailyGains = new int[10];
        dailyGains[0] = 0;

        for (int i = 1; i < dailyGains.length; i++) {
            dailyGains[i] = scan.nextInt();
            double dailyGainsD = dailyGains[i];
            double dailyGainsDm1 = dailyGains[i - 1];

            if (dailyGains[i] == 0)
                break;
            else if (dailyGainsDm1 < dailyGainsD * 0.95)
                System.out.printf("Der letzte Gewinn von %d ist um mehr als 5% gewachsen auf %d %n.", dailyGainsDm1, dailyGainsD);
            else
                System.out.println("Der Gewinn ist um weniger wie 5% gewachsen oder sogar gefallen?");


        }
    }

        public static void main (String[] args){
            count5PercentJumps();
        }



}

