import java.util.Objects;

public class Aufgabe423 {

    static boolean isProbablyApproching(String[] signs) {
        if (signs.length < 4)
            return false;


        for (int i = 1,counter = 1; i < signs.length; i++) {
            if (Objects.requireNonNull(signs[i]).equals(Objects.requireNonNull(signs[i - 1]))) {
                counter++;
                if (counter == 4) {
                    return true;
                }
            } else {
                counter = 1;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        boolean yesOrNo = isProbablyApproching(new String[] {"a", "b", "a", "a", "a", "b", "b"});
        System.out.printf(String.valueOf(yesOrNo));
    }
}

