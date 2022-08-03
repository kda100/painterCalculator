import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the height of the wall (m)?");
        final double height = scanner.nextDouble();

        System.out.println("What is the width of the wall (m)?");
        final double width = scanner.nextDouble();

        System.out.println("How many coats would you like?");
        final double coats = scanner.nextDouble();

        final double volumeOfPaint = height * width * 0.16667 * coats;
        System.out.println("You will need about " + Math.round(volumeOfPaint) + " litres of paint");
    }
}