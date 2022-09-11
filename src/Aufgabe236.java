import java.util.Random;
import java.util.Scanner;

public class Aufgabe236 {
    public static void main(String[] args) {
        int dealer = 0;
        int player = 0;
        int input;

        boolean startGame = true;

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        while (startGame){

            while (player < 21){
                System.out.println("Möchtest du eine Karte ziehen dann schreibe 1, falls nicht schreibe 2 ");
                input = scan.nextInt();

                if (input == 1) {
                    System.out.printf("Du hast nun %d Punkte \n", player += random.nextInt(11) + 1);
                }else if (input == 2) {
                    System.out.println("Der Dealer ist nun an der Reihe");
                    break;
                } else if (player > 21) {
                    break;
                }
            }


            while (dealer < 21){
                if (dealer < 21 && dealer > player || player > 21){
                    break;
                }
                System.out.printf("Der Dealer hat %d Punkte \n",dealer += random.nextInt(11)+1);
            }

            if (player > dealer && player < 21 || dealer > 21){
                System.out.print("Spiel gewonnen");
                break;
            }else if (player == dealer){
                System.out.print("Unentschieden");
                break;
            }else{
                System.out.println("Spiel verloren");
                break;
            }
        }
    }
}


