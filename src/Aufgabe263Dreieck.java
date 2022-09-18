public class Aufgabe263Dreieck {

    public static boolean rightTriangle(double a, double b, double c, double tolerance) {
        return a * a + b * b <= c * c + tolerance && a * a + b * b >= c * c - tolerance ;
    }
}
