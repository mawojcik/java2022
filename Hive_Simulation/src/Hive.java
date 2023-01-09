import java.util.concurrent.Semaphore;

class Hive {
    private static final Semaphore passage1 = new Semaphore(1);
    private static final Semaphore passage2 = new Semaphore(1);

    public void enter() throws InterruptedException {
        if (passage1.tryAcquire()) {
            // przelot 1 jest dostępny, więc pszczoła może przelatywać przez niego
            System.out.println("Pszczoła przelatuje przez przelot 1");
            return;
        }
        if (passage2.tryAcquire()) {
            // przelot 1 jest zajęty, ale przelot 2 jest dostępny, więc pszczoła może przelatywać przez niego
            System.out.println("Pszczoła przelatuje przez przelot 2");
            return;
        }
        System.out.println("Oba przeloty zajęte, czekamy");
        // oba przeloty są zajęte, więc pszczoła musi poczekać
        passage1.acquire();
    }

    public void exit() {
        // zwolnij jeden z przelotów, żeby inni mogli z niego skorzystać
        passage1.release();
        passage2.release();
    }
}