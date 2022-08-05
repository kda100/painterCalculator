enum WallShape {
    SQUARE,
    RECTANGLE,
    CIRCLE,
    TRAPEZIUM,
}

enum Colour {
    RED,
    GREEN,
    BLUE,
}

enum Finish {
    SILK,
    MATT,
    SATIN,
    GLOSS
}


public class Wall {
    final double surfaceArea;
    final WallShape wallShape;
    final Finish finish;
    final Colour colour;
    final int coats;

    private double litres = 0;

    Wall(double surfaceArea, WallShape wallShape, Finish finish, Colour colour, int coats) {
        this.surfaceArea = surfaceArea;
        this.wallShape = wallShape;
        this.finish = finish;
        this.colour = colour;
        this.coats = coats;
    }

    public double getLitres() {
        if (litres == 0) {
            this.litres = PaintCalculator.amount(this);
        }
        return this.litres;
    }
}
