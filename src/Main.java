import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static Wall[] createWalls(int numberOfWalls) {
        Wall[] walls = new Wall[numberOfWalls];

        for(int wallNum = 0; wallNum < numberOfWalls; wallNum++) {
            final WallShape wallShape = WallShape.valueOf(Question.getStringAnswer("What is the shape of wall number " + (wallNum + 1) + "\n" + EnumHelper.wallShapes, EnumHelper.wallShapes).toUpperCase());
            final double surfaceArea = SurfaceAreaCalculator.calculateSurfaceArea(wallShape, wallNum);
            final Colour colour = Colour.valueOf(Question.getStringAnswer("What will be the colour of wall number " + (wallNum + 1) + "\n" + EnumHelper.colours, EnumHelper.colours).toUpperCase());
            final Finish finish = Finish.valueOf(Question.getStringAnswer("What will be the finish of wall number " + (wallNum + 1) + "\n" + EnumHelper.finishes, EnumHelper.finishes).toUpperCase());
            final double coats = Math.round(Question.getNumericAnswer("How many coats will you use on wall number " + (wallNum + 1), 5));
            walls[wallNum] = new Wall(surfaceArea, wallShape, finish, colour, (int) coats);
        }
        return walls;
    }
    public static void main(String[] args) {

        final int numberOfWalls = (int) Math.round(Question.getNumericAnswer("How many walls would you like painted?", 4));

        Wall[] walls = createWalls(numberOfWalls);

        double totalLitres = 0;
        double totalCost = 0;

        for(Wall wall: walls) {
            final double litres = PaintCalculator.amount(wall);
            totalLitres += litres;
            totalCost += CostCalculator.cost(wall, litres);
        }

        System.out.println("For " + numberOfWalls + " wall(s) you will use about " + Math.round(totalLitres * 100.0) / 100.0 + " litres of paint and that will cost you about £" + Math.round(totalCost * 100.0) / 100.0);
    }
}