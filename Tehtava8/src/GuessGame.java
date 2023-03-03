import java.util.Scanner;

/**
 * Guessing game where the players need to guess a number between 1 and 100.
 * The player who gets it right first wins.
 *
 * @author rasmushy
 */
public class GuessGame extends Game {

    private int numberToGuess;
    private int currentPlayer;
    private int[] players;
    private Scanner scanner = new Scanner(System.in);

    @Override
    void initializeGame() {
        players = new int[playersCount];
        for (int i = 0; i < playersCount; i++) {
            players[i] = i + 1;
        }
        numberToGuess = (int) (Math.random() * 100 + 1);
        System.out.println("I'm thinking of a number between 1 and 100...");
        System.out.println("Can you guess it?\n\n**********");
    }

    @Override
    void makePlay(int player) {
        currentPlayer = player;
        System.out.println("\nPlayer " + players[currentPlayer] + " turn to guess: ");
        String str = scanner.nextLine();
        int guess = Integer.parseInt(str);

        if (guess == numberToGuess) {
            numberToGuess = 0;
        } else if (guess < numberToGuess) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }
    }

    @Override
    boolean endOfGame() {
        return numberToGuess == 0;
    }

    @Override
    void printWinner() {
        System.out.println("\n\nPlayer " + players[currentPlayer] + " won!");
    }
}
