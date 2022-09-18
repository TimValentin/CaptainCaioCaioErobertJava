public class Aufgabe264 {
    static void collatz(long n) {
        while (n > 1) {
            System.out.print(n + " -> ");
            if (n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
        }
        System.out.println(n);
    }

    static long collatzMax(long n) {
        long max = n;
        while (n > 1) {
            if (n % 2 == 0)
                n /= 2;
            else {
                n = 3 * n + 1;
                if (n > max)
                    max = n;
            }
        }
        return max;
    }



    public static void main(String[] args) {
        collatz(27);
        System.out.println(collatzMax(27));
    }
}


