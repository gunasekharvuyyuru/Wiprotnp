class Box {
    double width, height, depth;


    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {

        Box b = new Box(10, 5, 2);

        System.out.println("Width  : " + b.width);
        System.out.println("Height : " + b.height);
        System.out.println("Depth  : " + b.depth);
        System.out.println("Volume : " + b.volume());
    }
}
    

