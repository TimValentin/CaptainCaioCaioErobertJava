public class Aufgabe2514 {
    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) {
            for (int l = 0; l < 10; l++) {
                for (int t = 0; t < 10; t++) {
                    for (int o = 0; o < 10; o++) {
                        if (t == x + l && l == o + x) {
                            if (x != l && x != t && x != o && l != t && l != o && o != t) {
                                System.out.println("Alle Ziffern (Variablen) sind unterschiedlich");
                            }
                            System.out.printf("x = %d, l = %d, t = %d, o = %d%n", x, l, t, o);
                        }
                    }
                }
            }
        }
    }
}

