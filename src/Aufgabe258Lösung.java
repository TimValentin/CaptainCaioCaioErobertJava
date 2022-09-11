public class Aufgabe258Lösung {
    public static void main(String[] args) {
        final long n = 52357;
        long largest = 0;
        long smallest = n == 0 ? 0 : 9;
        for ( long value = Math.abs( n ); value != 0; value /= 10 ) {
            long lastDigit = value % 10;
            System.out.printf("last Digit = %d und value = %d %n",lastDigit,value);
            largest = Math.max (lastDigit, largest );
            smallest = Math.min (lastDigit, smallest);
        }
        System.out.println( smallest + ", " + largest );
    }
}
