public class Room {
    final int numberOfWalls;
    final Wall[] walls;
    private double totalLitres = 0;
    private double totalCost = 0;


    public Room() {
        this.numberOfWalls = (int) Math.round(Questioner.getNumericAnswer("How many walls would you like painted?", 4));

        Wall[] walls = new Wall[numberOfWalls];

        for (int wallNum = 0; wallNum < numberOfWalls; wallNum++) {
            final WallShape wallShape = WallShape.valueOf(Questioner.getStringAnswer("What is the shape of wall number " + (wallNum + 1) + "\n" + EnumHelper.wallShapes, EnumHelper.wallShapes).toUpperCase());
            final double surfaceArea = SurfaceAreaCalculator.calculateSurfaceArea(wallShape, wallNum);
            final Colour colour = Colour.valueOf(Questioner.getStringAnswer("What will be the colour of wall number " + (wallNum + 1) + "\n" + EnumHelper.colours, EnumHelper.colours).toUpperCase());
            final Finish finish = Finish.valueOf(Questioner.getStringAnswer("What will be the finish of wall number " + (wallNum + 1) + "\n" + EnumHelper.finishes, EnumHelper.finishes).toUpperCase());
            final double coats = Math.round(Questioner.getNumericAnswer("How many coats will you use on wall number " + (wallNum + 1), 5));
            walls[wallNum] = new Wall(surfaceArea, wallShape, finish, colour, (int) coats);
        }
        this.walls = walls;
    }

    public double getTotalLitres() {
        if (totalLitres == 0) {
            for (Wall wall : walls) {
                this.totalLitres += wall.getLitres();
            }
        }
        return this.totalLitres;
    }

    public double getTotalCost() {
        if (totalCost == 0) {
            for (Wall wall : walls) {
                totalCost += CostCalculator.cost(wall);
            }
        }
        return this.totalCost;
    }
}
