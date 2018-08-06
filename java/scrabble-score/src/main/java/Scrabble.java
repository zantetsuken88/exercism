import java.util.HashMap;

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

  private String word;
  private WordMultiplier multiplier;

  Scrabble(String word) {
    this(word, WordMultiplier.SINGLE);
  }

  Scrabble(String word, Scrabble.WordMultiplier multiplier) {
    this.word = word;

    this.multiplier = multiplier;
  }

  int getScore() {
    char[] wordChars = word.toLowerCase().toCharArray();

    int score = 0;

    for (char c : wordChars) {
      score += SCORE_MAP.get(c);
    }

    return score * multiplier.multiplier;

  }


}