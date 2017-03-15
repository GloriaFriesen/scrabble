import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForOnePointLetters_1(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
    assertEquals(expected, testScrabble.calculateScore("e"));
    assertEquals(expected, testScrabble.calculateScore("i"));
    assertEquals(expected, testScrabble.calculateScore("o"));
    assertEquals(expected, testScrabble.calculateScore("u"));
    assertEquals(expected, testScrabble.calculateScore("l"));
    assertEquals(expected, testScrabble.calculateScore("n"));
    assertEquals(expected, testScrabble.calculateScore("r"));
    assertEquals(expected, testScrabble.calculateScore("s"));
    assertEquals(expected, testScrabble.calculateScore("t"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoPointLetter_2(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
    assertEquals(expected, testScrabble.calculateScore("g"));
  }

  @Test
  public void calculateScore_returnScoreForThreePointLetter_3(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
    assertEquals(expected, testScrabble.calculateScore("c"));
    assertEquals(expected, testScrabble.calculateScore("m"));
    assertEquals(expected, testScrabble.calculateScore("p"));
  }

  @Test
  public void calculateScore_returnScoreForFourPointLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
    assertEquals(expected, testScrabble.calculateScore("h"));
    assertEquals(expected, testScrabble.calculateScore("v"));
    assertEquals(expected, testScrabble.calculateScore("w"));
    assertEquals(expected, testScrabble.calculateScore("y")); 
  }
}
