import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter the first number");
            int operand1 = scanner.nextInt();
            System.out.println("Please, enter the first arithmetic operator");
            char operation = scanner.next().charAt(0);
            System.out.println("Please, enter the second number");
            int operand2 = scanner.nextInt();
            System.out.println(operation);

            if (operation == '+') {
                int result = operand1 + operand2;
                System.out.println("Answer: " + result);
            } else if (operation == '-') {
                int result = operand1 - operand2;
                System.out.println("Answer: " + result);
            } else if (operation == '*') {
                int result = operand1 * operand2;
                System.out.println("Answer: " + result);
            } else if (operation == '/') {
                int result = operand1 / operand2;
                System.out.println("Answer: " + result);
            }
        }
    }
}
//bag fix