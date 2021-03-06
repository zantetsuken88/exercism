import java.util.HashMap;
import java.util.List;

class Scrabble {
  private static final HashMap<Character, Integer> SCORE_MAP = new HashMap<Character, Integer>() {{
    put('a', 1);
    put('b', 3);
    put('c', 3);
    put('d', 2);
    put('e', 1);
    put('f', 4);
    put('g', 2);
    put('h', 4);
    put('i', 1);
    put('j', 8);
    put('k', 5);
    put('l', 1);
    put('m', 3);
    put('n', 1);
    put('o', 1);
    put('p', 3);
    put('q', 10);
    put('r', 1);
    put('s', 1);
    put('t', 1);
    put('u', 1);
    put('v', 4);
    put('w', 4);
    put('x', 8);
    put('y', 4);
    put('z', 10);
  }};
  public enum WordMultiplier {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3);

    private final int multiplier;

    WordMultiplier(int multiplier) {
      this.multiplier = multiplier;
    }
  }
  public enum LetterMultiplier {
    SINGLE(1),
    DOUBLE(2),
    TRIPLE(3);

    private final int letterMultiplier;

    LetterMultiplier(int letterMultiplier) {
      this.letterMultiplier = letterMultiplier;
    }
  }
  private String word;
  private WordMultiplier multiplier;
  private List<LetterMultiplier> letterMultipliers;

  Scrabble(String word) {
    this(word, WordMultiplier.SINGLE);
  }

  Scrabble(String word, Scrabble.WordMultiplier multiplier) {
    this.word = word;
    this.multiplier = multiplier;
  }

  Scrabble(String word, Scrabble.WordMultiplier multiplier, List<LetterMultiplier> letterMultipliers) {
    this.word = word;
    this.multiplier = multiplier;
    this.letterMultipliers = letterMultipliers;
  }

  int getScore() {
    char[] wordChars = word.toLowerCase().toCharArray();
    int score = 0;
    int i = 0;

    for (char c : wordChars) {
      if (letterMultipliers != null) {
        score += SCORE_MAP.get(c) * letterMultipliers.get(i++).letterMultiplier;
      } else {
        score += SCORE_MAP.get(c);
      }
    }
    return score * multiplier.multiplier;
  }
}