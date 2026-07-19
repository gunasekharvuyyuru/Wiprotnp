class RaceThread extends Thread {

    private static boolean raceOver = false;

    RaceThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 100 && !raceOver; i++) {

            System.out.println(getName() + " ran " + i + " meters");

            if (getName().equals("Hare") && i == 60) {
                try {
                    System.out.println("Hare is sleeping for 1000 milliseconds...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (i == 100 && !raceOver) {
                raceOver = true;
                System.out.println("\n" + getName() + " wins the race!");
            }
        }
    }
}

public class HareAndTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}