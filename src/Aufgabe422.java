import java.util.Scanner;

public class Aufgabe422 {


    static int count5PercentJumps( int[] dailyGains ) {
        if ( dailyGains.length < 2 )
            return 0;
        final double MIN_PERCENT = 5;
        int result = 0;
// Index variable i starting at 1, second element
        for ( int i = 1; i < dailyGains.length; i++ ) {
            double yesterday = dailyGains[ i - 1 ];
            double today = dailyGains[ i ];
            double percent = today / yesterday * 100 - 100;
            if ( percent >= MIN_PERCENT )
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(count5PercentJumps(new int[]{100,500,2000,500,20000,25555}));
    }
}

