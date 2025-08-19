import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException(String message) {
        super(message);
    }
}

class MaxInputException extends Exception {
    public MaxInputException(String message) {
        super(message);
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException(String message) {
        super(message);
    }
}

class CustomCalculator {
    public void checkInput(double a, double b) throws MaxInputException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException("Input can't be greater than 100000");
        }
    }

    public double add(double a, double b) throws MaxInputException {
        checkInput(a, b);
        return a + b;
    }

    public double subtract(double a, double b) throws MaxInputException {
        checkInput(a, b);
        return a - b;
    }

    public double multiply(double a, double b) throws MaxInputException, MaxMultiplierReachedException {
        checkInput(a, b);
        if (a > 7000 || b > 7000) {
            throw new MaxMultiplierReachedException("Multiplication input can't be greater than 7000");
        }
        return a * b;
    }

    public double divide(double a, double b) throws MaxInputException, CannotDivideByZeroException {
        checkInput(a, b);
        if (b == 0) {
            throw new CannotDivideByZeroException("Can't divide by 0");
        }
        return a / b;
    }
}

public class customCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomCalculator calc = new CustomCalculator();

        try {
            System.out.print("Enter first number : ");
            if (!sc.hasNextDouble()) {
                throw new InvalidInputException("Invalid input : Please enter numbers only!");
            }
            double a = sc.nextDouble();

            System.out.print("Enter second number : ");
            if (!sc.hasNextDouble()) {
                throw new InvalidInputException("Invalid input : Please enter numbers only!");
            }
            double b = sc.nextDouble();

            System.out.print("Choose operation (+ , - , * , /): ");
            String op = sc.next();

            double result = 0;
            switch (op) {
                case "+":
                    result = calc.add(a, b);
                    break;
                case "-":
                    result = calc.subtract(a, b);
                    break;
                case "*":
                    result = calc.multiply(a, b);
                    break;
                case "/":
                    result = calc.divide(a, b);
                    break;
                default:
                    throw new InvalidInputException("Invalid Operation : " + op);
            }

            System.out.println("Result : " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}