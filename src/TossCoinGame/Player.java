package TossCoinGame;

public class Player {
    protected String name;
    protected String guess;

    public Player(String name) {
        setName(name);
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
