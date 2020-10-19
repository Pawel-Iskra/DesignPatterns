package singleton;

public enum GuessGameEnum {
    INSTANCE;

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - game from " + getClass().getName() + " is running...");
        }
        System.out.println("Game finished.");
    }
}
