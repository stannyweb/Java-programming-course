package TossCoinGame;

import java.util.Scanner;

public class CoinTossGame {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CoinTossGame coinToss = new CoinTossGame();
        coinToss.coinWinner();
    }

    public void coinWinner() {
        Player player1 = new Player("Stan");
        Player player2 = new Player("Angelov");

        System.out.println(player1.getName() + ", enter your guess (Heads or Tails): ");
        player1.setGuess(scanner.nextLine());

        System.out.println(player2.getName() + ", enter your guess (Heads or Tails): ");
        player2.setGuess(scanner.nextLine());

        Coin coin = new Coin();
        coin.flip();

        System.out.println("The coin landed on " + coin.getSide());

        if (coin.getSide().equals(player1.getGuess())) {
            System.out.println(player1.getName() + " Won. With " + player1.getGuess());
        } else
            System.out.println(player2.getName() + " Won. With " + player2.getGuess());
    }
}
