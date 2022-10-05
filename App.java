import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        String words = inputScanner.nextLine();
        return words;
    }

    private static double getDouble(String prompt) {
        // double inputDouble = Double.parseDouble(prompt);
        System.out.println(prompt);
        double number = inputScanner.nextDouble();
        return number;

    }
        public static void main(String[] args) {
            // double number = getDouble("What is your favorite number?");
            // System.out.println("My favorite number is " + number);

            // inputScanner.nextLine();

            // String moreWords = getString("What is your favorite player?");
            // System.out.println("My favorite player is " + moreWords);
            double num1 = getDouble("enter first number");
            double num2 = getDouble("enter second number");
            String test = String.format("You want to add %f and %f", num1, num2);
            System.out.println(test);


        }
    }