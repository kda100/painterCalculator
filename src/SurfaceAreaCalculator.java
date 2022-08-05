public class SurfaceAreaCalculator {
    private final static int maxValue = 10;
    public static double calculateSurfaceArea(WallShape wallShape, int wallNum) {
        switch (wallShape) {
            case SQUARE:
            case RECTANGLE: {
                final double height = Questioner.getNumericAnswer("What is the height of wall number " + (wallNum + 1) + " (m)? ", maxValue);
                final double width = Questioner.getNumericAnswer("What is the width of wall number " + (wallNum + 1) + " (m)?", maxValue);
                return height * width;
            }
            case TRAPEZIUM: {
                final double height = Questioner.getNumericAnswer("What is the height of wall number " + (wallNum + 1) + " (m)? ", maxValue);
                final double ceilingWidth = Questioner.getNumericAnswer("What is the ceiling width of wall number " + (wallNum + 1) + " (m)?", maxValue);
                final double baseWidth = Questioner.getNumericAnswer("What is the base width of wall number " + (wallNum + 1) + " (m)?", maxValue);
                return ((ceilingWidth + baseWidth) / 2) * height;
            }
            case CIRCLE: {
                final double diameter = Questioner.getNumericAnswer("What is the diameter of wall number " + (wallNum + 1) + " (m)?", maxValue);
                return 0.25 * Math.PI * Math.pow(diameter, 2);
            }
            default: break;
        }
        return  0;
    }
}
