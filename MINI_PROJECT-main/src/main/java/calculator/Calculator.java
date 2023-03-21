package calculator;


import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-using-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find Multiplication\nPress 2 to find Cube Root\nPress 3 to find Square\nPress 4 to find Subtraction\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // POWER
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Power of "+number1+" and "+number2+" is : " + calculator.power(number1,number2));
                    System.out.println("\n");

                    break;
                case 2:
                    // find cube root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Cube root of "+number1+" is : " + calculator.cuberoot(number1));
                    System.out.println("\n");

                    break;
                case 3:
                    // find square
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square of "+number1+" is : " + calculator.square(number1));
                    System.out.println("\n");

                    break;
                case 4:
                    // do Subtraction
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Subtraction of "+number2+" from "+number1+" is : " + calculator.sub(number1,number2));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
    public double myFactorial(double n) {
        if (n <= 2) {
            return n;
        }
        return n * myFactorial(n - 1);
    }

    public double power(double number1, double number2) {
        logger.info("[POWER - " + number1 + " TO THE POWER " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double factorial(double number1) {
        logger.info("[FACTORIAL] - " + number1);
        double result = myFactorial(number1);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double square(double number1) {
        logger.info("[SQUARE] - " + number1);
        double result = number1 * number1;
        logger.info("[RESULT - SQUARE] - " + result);
        return result;
    }

    public double logarithm(double number1) {
        logger.info("[LOGARITHM - " + number1 );
        double result = Math.log(number1);
        logger.info("[RESULT - LOGARITHM] - " + result);
        return result;
    }


}

