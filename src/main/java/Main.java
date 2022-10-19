public class Main {
    public static void main(String[] args) {
        String command = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = 0;
        if (args.length > 2) {
            num2 = Integer.parseInt(args[2]);
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
            default:
                break;
        }
    }
}
