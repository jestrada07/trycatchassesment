import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            try {

                System.out.println("Enter Numerator");
                int numerator = scanner.nextInt(); // numerator value
                System.out.println("Enter Denominator");
                int denominator = scanner.nextInt(); // denominator value

                int result = numerator / denominator;
                System.out.println("result is " + result);

            } catch (ArithmeticException e) {
                System.out.println("you can't divide by zero");
            } catch (InputMismatchException exception) {

                System.out.println("You must enter Whole numbers");
                scanner.nextLine();
            }



        }

    }

    }
