import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Box {

    private double length;
    private double width;
    private double height;
    private double volume;

    public Box(double length, double width, double height) {

        this.length = length;
        this.width = width;
        this.height = height;

        // Calculate volume
        this.volume = Math.round(length * width * height * 100.0) / 100.0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    // Compare boxes based on volume
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Box box = (Box) obj;

        return Double.compare(volume, box.volume) == 0;
    }


    // Generate hash based on volume
    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }


    @Override
    public String toString() {

        return String.format(
                "Length = %.1f Width = %.1f Height = %.1f Volume = %.2f",
                length,
                width,
                height,
                volume
        );
    }
}


public class SetofBoxes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Box> boxSet = new LinkedHashSet<>();

        System.out.println("Enter the number of Box");
        int numberOfBoxes = scanner.nextInt();


        for (int i = 1; i <= numberOfBoxes; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = scanner.nextDouble();

            System.out.println("Enter Width");
            double width = scanner.nextDouble();

            System.out.println("Enter Height");
            double height = scanner.nextDouble();


            Box box = new Box(length, width, height);

            boxSet.add(box);
        }


        System.out.println("Unique Boxes in the Set are");

        for (Box box : boxSet) {
            System.out.println(box);
        }


        scanner.close();
    }
}