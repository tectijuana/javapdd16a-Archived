import java.util.Random;

class SnakesAndLadders extends Game {

    /* Implementation of necessary concrete methods */
    void initializeGame() {
        // Initialize players
        playerPositions = new int[playersCount];
        for (int i = 0; i < playersCount; i++) {
           playerPositions[i] = 0;
        }

        die = new Random();

        winnerId = -1;
    }

    void makePlay(int player) {
        // Roll the die
        int dieRoll = die.nextInt(6) + 1;

        // Move the token
        playerPositions[player] += dieRoll;

        // Move up or down because of the ladders or the snakes
        int penaltyOrBonus = board[playerPositions[player]];
        playerPositions[player] += penaltyOrBonus;

        if (playerPositions[player] > 8) {
           // Has reached the top square
           winnerId = player;
        }
    }

    boolean endOfGame() {
        // The game is over when a winner exists
        return (winnerId != -1);
    }

    void printWinner() {
        System.out.println("Player #" + winnerId + " has won!");
    }

    /* Specific declarations for the Snakes and Ladders game. */

    // The board from the bottom square to the top square
    // Each integer is a square
    // Negative values are snake heads with their lengths
    // Positive values are ladder bottoms with their heights
    private static final int[] board = {0, 0, -1, 0, 3, 0, 0, 0, -5, 0};

    // The player positions
    // Each integer represents one player
    // The integer is the position of the player (index) on the board
    private int[] playerPositions = null;

    private Random die = null;

    private int winnerId = -1;
}
