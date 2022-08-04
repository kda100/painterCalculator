import java.util.HashMap;

public class CostCalculator {
    public static HashMap<Colour, Double> colourMultiplier = new HashMap<Colour, Double>();
    public static HashMap<Finish, Double> finishMultiplier = new HashMap<Finish, Double>();

    static {
        colourMultiplier.put(Colour.RED, 1.0);
        colourMultiplier.put(Colour.BLUE, 1.0);
        colourMultiplier.put(Colour.GREEN, 1.0);

        finishMultiplier.put(Finish.GLOSS, 0.8);
        finishMultiplier.put(Finish.MATT, 1.2);
        finishMultiplier.put(Finish.SATIN, 1.0);
        finishMultiplier.put(Finish.SILK, 1.0);

    }

    public static double cost(Wall wall, double litres) {
        return 4 * wall.surfaceArea * colourMultiplier.get(wall.colour) * finishMultiplier.get(wall.finish);
    }
}
