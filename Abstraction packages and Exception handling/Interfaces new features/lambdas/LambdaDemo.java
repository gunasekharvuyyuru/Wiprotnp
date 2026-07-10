package lambdas;

public class LambdaDemo {

    public static void main(String[] args) {

        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        int addResult = t1.myFunction(10, 20, 30);
        int multiplyResult = t2.myFunction(5, 4, 3);

        System.out.println("Addition Result: " + addResult);
        System.out.println("Multiplication Result: " + multiplyResult);
    }

}