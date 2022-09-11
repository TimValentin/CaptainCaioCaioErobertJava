public class Aufgabe246Lösung {
    public static void main(String[] args) {
        String input = new java.util.Scanner( System.in ).nextLine();
        switch ( input ) {
            case "Ay":
            case "Ay, ay":
            case "Ein Ei":
            case "yes":
            case "ja":
                System.out.println("Keep it up!");
                break;
            default:
                System.out.println("Don't you dare!");
        }
    }
}
