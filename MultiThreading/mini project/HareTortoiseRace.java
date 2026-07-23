class RaceThread extends Thread {

    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            // Hare sleeps for 1 second after 60 meters
            if (getName().equals("Hare") && i == 61) {
                try {
                    System.out.println("Hare is sleeping for 1 second...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

            System.out.println(getName() + " : " + i + " meters");

            // Check if this thread finishes first
            if (i == 100) {
                System.out.println(getName() + " wins the race!");
            }
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");

        // Hare gets higher priority
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}