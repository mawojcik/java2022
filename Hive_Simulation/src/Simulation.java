import java.util.Random;

class Simulation {
    private static final int NUM_BEES = 10;
    private static final Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {
        Hive hive = new Hive();
        for (int i = 0; i < NUM_BEES; i++) {
            Bee bee = new Bee(i, rand.nextInt(11));
            bee.start();
            hive.enter();
            bee.join();
            hive.exit();
        }
    }
}
