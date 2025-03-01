package TossCoinGame;

import java.util.Random;

public class Coin {

    private String side;
    private final String HEADS = "Heads";
    private final String TAILS = "Tails";

    public String flip() {

        Random random = new Random();
        int number = random.nextInt(2) + 1;

        if (number == 1) side = HEADS;
        else side = TAILS;
        return side;
    }

    public String getSide() {
        return side;
    }
}
