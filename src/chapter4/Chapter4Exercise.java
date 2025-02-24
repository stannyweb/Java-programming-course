package chapter4;

import java.util.Random;

public class Chapter4Exercise {

    public static void main(String[] args) {
        Random random = new Random();


//        1. init known values
        int boardSpace = 20;
        int diceRolls = 5;
        int playerLocation = 0;

        for (int i = 1; i <= diceRolls; i++) {
            int die = random.nextInt(6) + 1;
            playerLocation += die;

            System.out.printf("Roll #%d: You've rolled a %d. ", i, die);

            if (playerLocation == boardSpace) {
                System.out.print("You are on space " + playerLocation + ". Congrats you win!");
                break;

            } else if (playerLocation > boardSpace) {
                System.out.print("Unfortunately that takes you past " + boardSpace + "spaces. You lose!");
                break;

            } else if (i == diceRolls && playerLocation < boardSpace) {
                System.out.println("You are on space " + playerLocation + ".");
                System.out.println("Unfortunately, you didn't make it to all " + playerLocation + " spaces. You lose!");

            } else {
                int spacesToGo = boardSpace - playerLocation;
                System.out.print("You are now on space " + playerLocation +
                        " and have " + spacesToGo + " more to go.");
            }
            System.out.println();
        }
    }
}
