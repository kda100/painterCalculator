public class PaintCalculator {
    public static double amount(Wall wall) {
        return wall.coats * wall.surfaceArea * 0.167;
    }
}
