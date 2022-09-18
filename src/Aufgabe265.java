import java.util.Scanner;

public class Aufgabe265 {
    static int value;
    static int flamethrower = 500;




    private static void startHtml(){
       System.out.println("<html>");
   }

    private static void endHtml(){
       System.out.print("</html>");
   }

    private static void startTable(){
       System.out.println("<table>");
   }

    private static void endTable(){
       System.out.println("</table>");
   }

    private static void startRow(){
       System.out.printf("<tr>");
   }

    private static void endRow(){
       System.out.println("</tr>");
   }

    private static void headerCell(String value){
       System.out.printf("<th>%s</th>", value);
   }

    private static void dataCell(String value){
       System.out.printf("<td>%s</td>", value);
   }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Geben Sie bitte die Anzahl an Produkten ein die Sie verkaufen möchten: ");
        value = scan.nextInt();

        startHtml();
        startTable();

        startRow();
        headerCell("Quantity");
        headerCell("Flamethrower");
        endRow();

        for (int i = 1; i <= value; i++) {
            startRow();
            dataCell(String.valueOf(i));
            dataCell(String.valueOf(flamethrower * i));
            endRow();
        }

        endTable();
        endHtml();
        }

}



