public class Aufgabe254 {
    public static void main(String[] args) {
        double t = Math.random() * 10;


        while (t > 0) {
            if (t < 1)
                t *= 2;
            else
                t--;
            System.out.println(t);
        }
    }
}

