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
    double surfaceArea;
    WallShape wallShape;
    Finish finish;
    Colour colour;
    int coats;

    Wall(double surfaceArea, WallShape wallShape, Finish finish, Colour colour, int coats) {
        this.surfaceArea = surfaceArea;
        this.wallShape = wallShape;
        this.finish = finish;
        this.colour = colour;
        this.coats = coats;
    }
}
