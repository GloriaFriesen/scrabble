import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Scrabble {
  public Integer calculateScore(String letters) {
    String[] onePointLetters  = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    List onePointList = Arrays.asList(onePointLetters);
    String[] twoPointLetters = {"d", "g"};
    List twoPointList = Arrays.asList(twoPointLetters);
    Integer letterValue = 0;
    if (onePointList.contains(letters)) {
      letterValue = 1;
      return letterValue;
    } else if (twoPointList.contains(letters)){
      letterValue = 2;
      return letterValue;
    }
    return letterValue;
  }
}
