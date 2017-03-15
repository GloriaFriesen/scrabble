import java.util.ArrayList;
import java.util.List;
import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter your scrabble word:");
    String userInput = console.readLine();

    Scrabble newScrabble = new Scrabble();
    int finalScore = newScrabble.calculateWordScore(userInput);

    System.out.println(finalScore);

  }
}
