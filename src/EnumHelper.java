import java.util.ArrayList;
import java.util.List;

public class EnumHelper {
    public static ArrayList<String> wallShapes = new ArrayList<String>();
    public static ArrayList<String> colours = new ArrayList<String>();
    public static ArrayList<String> finishes = new ArrayList<String>();

    static {
        for(WallShape wallShape: WallShape.values()) {
            wallShapes.add(wallShape.toString());
        }
        for(Colour colour: Colour.values()) {
            colours.add(colour.toString());
        }
        for(Finish finish: Finish.values()) {
            finishes.add(finish.toString());
        }
    }
}
