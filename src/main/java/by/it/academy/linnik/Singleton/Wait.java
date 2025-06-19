package by.it.academy.linnik.Singleton;

public class Wait {
    public static void waitsFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
