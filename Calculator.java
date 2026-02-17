import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Multiplication and division
        System.out.println("Enter First Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int number2 = scanner.nextInt();

        int product = number1 * number2;
        int quotient = number1 / number2;
        int sum = number1 + number2;
        int difference = number1 - number2;

        System.out.println("product :" + product);
        System.out.println("Quotient :" + quotient);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        System.out.println(number1 + "is base and " + number2 + "is exponent and the RESULT is " + Math.pow(number1, number2));


    }
}
