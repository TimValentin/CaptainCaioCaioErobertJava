public class Aufgabe262Class {


    public static void line(int len){
        for (int i = 0; i < len; i++) {
            System.out.printf("-");
        }
        System.out.println();
    }

    public static void line(int len, char c){
        for (int i = 0; i < len; i++) {
            System.out.printf(String.valueOf(c));
        }
        System.out.println();
    }

    public static void line(String prefix, int len, char c, String suffix){
        System.out.printf("%s", prefix);
        for (int i = 0; i < len; i++) {
            System.out.printf("%s",c);
        }
        System.out.printf("%s",suffix);
        System.out.println();
    }
}
