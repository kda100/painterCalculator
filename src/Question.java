import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question {
    static private final Scanner scanner = new Scanner(System.in);

    public static double getNumericAnswer(String question, int maxValue) {
        while(true) {
            System.out.println(question);
            try {
                final double value = scanner.nextDouble();
                if(value >= 1 && value <= maxValue) {
                    return  value;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Invalid input please try again");
                scanner.nextLine();
            }
        }
    }

    public  static String getStringAnswer(String question, ArrayList<String> answers) {
        while(true) {
            System.out.println(question);
            try {
                final String answer = scanner.next().trim();
                if(answers.contains(answer.toUpperCase())) {
                    return answer;
                }
                throw new Exception();
            } catch(Exception e) {
                System.out.println("Invalid input please try again");
                scanner.nextLine();
            }
        }
    }
}
