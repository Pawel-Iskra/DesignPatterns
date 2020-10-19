package singleton;

public class App {
    public static void main(String[] args) {
        GuessGame game1 = GuessGame.getInstance();
        GuessGame game2 = GuessGame.getInstance();
        System.out.println("(game1 == game2) is the same instance? = " + (game1 == game2));
        game1.run();

        GuessGameEnum gameEnum1 = GuessGameEnum.INSTANCE;
        GuessGameEnum gameEnum2 = GuessGameEnum.INSTANCE;
        System.out.println("(gameEnum1 == gameEnum2) is the same instance? = " + (gameEnum1 == gameEnum2));
        gameEnum1.run();

    }
}
