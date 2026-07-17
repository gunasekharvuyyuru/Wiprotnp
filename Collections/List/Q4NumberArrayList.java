import java.util.ArrayList;

public class Q4NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);          // Integer
        numbers.add(20.5);        // Double
        numbers.add(15.75f);      // Float
        numbers.add(100L);        // Long
        numbers.add((short)50);   // Short
        numbers.add((byte)5);     // Byte

        System.out.println("Numbers in the ArrayList:");

        for (Number n : numbers) {
            System.out.println(n);
        }
    }
}