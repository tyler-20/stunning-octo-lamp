import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            int num1 = 0;
            int num2 = 0;

            if (tokens.length > 1) {
                num1 = Integer.parseInt(tokens[1]);
            }
            if (tokens.length > 2) {
                num2 = Integer.parseInt(tokens[2]);
            }

            Calculator calc = new Calculator();
            switch (command) {
                case "add":
                    System.out.println(calc.add(num1, num2));
                    break;
                case "subtract":
                    System.out.println(calc.subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println(calc.multiply(num1, num2));
                    break;
                case "divide":
                    System.out.println(calc.divide(num1, num2));
                    break;
                case "fibonacciNumberFinder":
                    System.out.println(calc.fibonacciNumberFinder(num1));
                    break;
                case "intToBinaryNumber":
                    System.out.println(calc.intToBinaryNumber(num1));
                    break;
                case "q":
                    run = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    
    }
}
