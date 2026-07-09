class Calculator {

    
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        int result1 = Calculator.powerInt(2, 3);
        double result2 = Calculator.powerDouble(5.5, 2);

        System.out.println("powerInt(2,3) = " + result1);
        System.out.println("powerDouble(5.5,2) = " + result2);
    }
}