class ColorCode {
    public static void main(String args[]) {

        char color = args[0].charAt(0);

        if (color == 'R') {
            System.out.println("Red");
        } else if (color == 'B') {
            System.out.println("Blue");
        } else if (color == 'G') {
            System.out.println("Green");
        } else if (color == 'O') {
            System.out.println("Orange");
        } else if (color == 'Y') {
            System.out.println("Yellow");
        } else if (color == 'W') {
            System.out.println("White");
        } else {
            System.out.println("Invalid Code");
        }

    }
}