import java.util.Random;

class Bee extends Thread {
    private static final Random rand = new Random();
    private final int id;
    private final int waitingTime;

    public Bee(int id, int waitingTime) {
        this.id = id;
        this.waitingTime = waitingTime*1000;
    }

    public void enter() throws InterruptedException {
        System.out.println("Pszczoła " + id + " podlatuje pod przelot");
        System.out.println("Pszczoła " + id + " wlatuje przez przelot");
        Thread.sleep(1000); // czas lotu
    }

    public void exit() throws InterruptedException {
        System.out.println("Pszczoła " + id + " wylatuje przez przelot");
        Thread.sleep(1000); // czas wylotu
    }

    public void run() {
        try {
            Thread.sleep(waitingTime);
            enter();
            Thread.sleep(rand.nextInt(5) + 1);
            exit();
            Thread.sleep(rand.nextInt(6) + 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




