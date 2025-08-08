import java.util.Scanner;
import java.util.Random;

public class guessNumber {
    static class GuessTheNumber {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        private int cGuess;
        private int uGuess;
        private int attempts;

        public void computerGuess() {
            cGuess = random.nextInt(100) + 1;
            attempts = 0;
        }

        public void userGuess() {
            System.out.print("Enter your guess (1-100) : ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
            }
            uGuess = sc.nextInt();
            attempts++;
        }

        public void checkGuess() {
            if (uGuess < 1 || uGuess > 100) {
                System.out.println("Your guess is out of range. Please guess a number between 1 and 100.");
            } else if (uGuess < cGuess) {
                System.out.println("Your guess is lesser than the number.");
            } else if (uGuess > cGuess) {
                System.out.println("Your guess is greater than the number.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + attempts + " attempt" + (attempts > 1 ? "s." : "."));
            }
        }

        public boolean isCorrect() {
            return uGuess == cGuess;
        }

        public void playGame() {
            System.out.println("Welcome to the Guess the Number game!");
            computerGuess();

            do {
                userGuess();
                checkGuess();
            } while (!isCorrect());
        }
    }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        game.playGame();
    }
}