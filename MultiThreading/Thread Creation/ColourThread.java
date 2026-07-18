import java.util.Random;

class ColourTask implements Runnable {
    public void run() {
        String[] colours = {"white", "blue", "black", "green", "red", "yellow"};
        Random random = new Random();

        while (true) {
            String colour = colours[random.nextInt(colours.length)];
            System.out.println(colour);

            if (colour.equals("red")) {
                break;
            }
        }
    }
}

public class ColourThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new ColourTask());
        thread.start();
    }
}