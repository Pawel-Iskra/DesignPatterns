package singleton;

public class App {
    public static void main(String[] args) {
        GuessGame game1 = GuessGame.getInstance();
        GuessGame game2 = GuessGame.getInstance();
        System.out.println("Is the same instance? = " + (game1 == game2));

        game1.run();
    }
}
