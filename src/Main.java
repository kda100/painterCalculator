public class Main {

    public static void main(String[] args) {
        final Room room = new Room();

        System.out.println("For " + room.numberOfWalls + " wall(s) you will use about " + Math.round(room.getTotalLitres() * 100.0) / 100.0 + " litres of paint and that will cost you about £" + Math.round(room.getTotalCost() * 100.0) / 100.0);
    }
}