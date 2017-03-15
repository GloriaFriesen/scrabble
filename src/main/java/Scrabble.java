import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Scrabble {
  public Integer calculateScore(String letters) {
    String[] onePointLetters  = {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    List onePointList = Arrays.asList(onePointLetters);
    String[] twoPointLetters = {"d", "g"};
    List twoPointList = Arrays.asList(twoPointLetters);
    String[] threePointLetters = {"b", "c", "m", "p"};
    List threePointList = Arrays.asList(threePointLetters);
    String[] fourPointLetters = {"f", "h", "v", "w", "y"};
    List fourPointList = Arrays.asList(fourPointLetters);
    String[] fivePointLetters = {"k"};
    List fivePointList = Arrays.asList(fivePointLetters);
    String[] eightPointLetters = {"j", "x"};
    List eightPointList = Arrays.asList(eightPointLetters);
    String[] tenPointLetters = {"q", "z"};
    List tenPointList = Arrays.asList(tenPointLetters);

    Integer letterValue = 0;
    if (onePointList.contains(letters)) {
      letterValue = 1;
    } else if (twoPointList.contains(letters)){
      letterValue = 2;
    } else if (threePointList.contains(letters)) {
      letterValue = 3;
    } else if (fourPointList.contains(letters)) {
      letterValue = 4;
    } else if (fivePointList.contains(letters)) {
      letterValue = 5;
    } else if (eightPointList.contains(letters)) {
      letterValue = 8;
    } else if (tenPointList.contains(letters)) {
      letterValue = 10;
    }
    return letterValue;
  }
}
