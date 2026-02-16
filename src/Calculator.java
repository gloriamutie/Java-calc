public class Calculator {


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b)
    {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {

        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double squareRoot(double a) {
        if (a < 0) throw new ArithmeticException("Could not compute square root of negative number");
        return Math.sqrt(a);
    }

    public static double modulus(double a, double b) {
        return a % b;
    }

}
