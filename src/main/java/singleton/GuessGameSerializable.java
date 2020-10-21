package singleton;

import java.io.Serializable;

public class GuessGameSerializable implements Serializable {

    private static final int serialVersionUID = 123456;

    private static GuessGameSerializable instance = new GuessGameSerializable();

    private GuessGameSerializable() {
    }

    public static GuessGameSerializable getInstance() {
        return instance;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - game from " + getClass().getName() + " is running...");
        }
        System.out.println("Game finished.\n");
    }

    protected Object readResolve() {
        return getInstance();
    }
}
