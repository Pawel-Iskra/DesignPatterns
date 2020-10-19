package singleton;

public class GuessGame {
    private static GuessGame instance;

    private GuessGame() {
    }

    public static GuessGame getInstance() {
        if (instance == null) {

            synchronized (GuessGame.class) {
                if (instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return instance;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - game is running...");
        }
        System.out.println("Game finished.");
    }

}
