import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    int cScore = 0;
    int uScore = 0;

    for (int i = 0; i < 5; i++) {
      int cInput = random.nextInt(3) + 1;

      System.out.print("Enter 1 for Rock, 2 for Paper, 3 for Scissor : ");
      int uInput = sc.nextInt();

      if ((cInput == 1 && uInput == 2) || (cInput == 2 && uInput == 3) || (cInput == 3 && uInput == 1)) {
        System.out.println("You won this round.");
        uScore++;
      } else if ((cInput == 1 && uInput == 3) || (cInput == 2 && uInput == 1) || (cInput == 3 && uInput == 2)) {
        System.out.println("Computer won this round.");
        cScore++;
      } else {
        System.out.println("Draw!");
      }
    }
    if (cScore > uScore) {
      System.out.println("Computer won this game!");
    } else if (uScore > cScore) {
      System.out.println("You won this game!");
    } else {
      System.out.println("It's a draw!");
    }
  }
}