import java.awt.*;

public class Aufgabe311 {

    // Program creates a map which contains a triangle and a ship. If the ship is inside the triangle ? "ship is in danger!" : "ship isn't in danger :)"
    public static void createMap(int mapSize, int shipPositionX, int shipPositionY, int[] triangleA, int[] triangleB, int[] triangleC){
        Polygon triangle = new Polygon();

        triangle.addPoint(triangleA[0],triangleA[1]);
        triangle.addPoint(triangleB[0],triangleB[1]);
        triangle.addPoint(triangleC[0],triangleC[1]);

        Point shipPosition = new Point(shipPositionX, shipPositionY);


        for (int y = 0; y < mapSize; y++) {
            for (int x = 0; x < mapSize; x++){
                Point map = new Point(x, y);

                if (shipPosition.equals(map))
                    System.out.print("S");
                else if (triangle.contains(map))
                    System.out.print("T");
                else
                    System.out.print("*");
            }
            System.out.println();
        }

        if (triangle.contains(shipPosition))
            System.out.printf("%nShip is in danger!!!");
        else
            System.out.printf("%nShip isn't in danger :)");
    }

    public static void main(String[] args) {
        createMap(50,25,25, new int[]{20, 40},new int[] {20, 1}, new int[] {45, 20});
    }

}
