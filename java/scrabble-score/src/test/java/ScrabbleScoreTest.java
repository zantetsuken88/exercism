import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ScrabbleScoreTest {

    private Scrabble scrabble;

    @Test
    public void testALowerCaseLetter() {
        scrabble = new Scrabble("a");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void testAUpperCaseLetter() {
        scrabble = new Scrabble("A");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void testAValuableLetter() {
        scrabble = new Scrabble("f");
        assertEquals(4, scrabble.getScore());
    }

    @Test
    public void testAShortWord() {
        scrabble = new Scrabble("at");
        assertEquals(2, scrabble.getScore());
    }

    @Test
    public void testAShortValuableWord() {
        scrabble = new Scrabble("zoo");
        assertEquals(12, scrabble.getScore());
    }

    @Test
    public void testAMediumWord() {
        scrabble = new Scrabble("street");
        assertEquals(6, scrabble.getScore());
    }

    @Test
    public void testAMediumValuableWord() {
        scrabble = new Scrabble("quirky");
        assertEquals(22, scrabble.getScore());
    }

    @Test
    public void testALongMixCaseWord() {
        scrabble = new Scrabble("OxyphenButazone");
        assertEquals(41, scrabble.getScore());
    }

    @Test
    public void testAEnglishLikeWord() {
        scrabble = new Scrabble("pinata");
        assertEquals(8, scrabble.getScore());
    }

    @Test
    public void testAnEmptyInput() {
        scrabble = new Scrabble("");
        assertEquals(0, scrabble.getScore());
    }

    @Test
    public void testEntireAlphabetAvailable() {
        scrabble = new Scrabble("abcdefghijklmnopqrstuvwxyz");
        assertEquals(87, scrabble.getScore());
    }

    @Test
    public void testDoubleWord() {
      scrabble = new Scrabble("abcdefghijklmnopqrstuvwxyz", Scrabble.WordMultiplier.DOUBLE);
      assertEquals(174, scrabble.getScore());
    }

    @Test
    public void testTripleWord() {
      scrabble = new Scrabble("abcdefghijklmnopqrstuvwxyz", Scrabble.WordMultiplier.TRIPLE);
      assertEquals(261, scrabble.getScore());
    }

    @Test
    public void testDoubleLetters() {
        List<Scrabble.LetterMultiplier> letterMultipliers = Arrays.asList(Scrabble.LetterMultiplier.SINGLE, Scrabble.LetterMultiplier.DOUBLE, Scrabble.LetterMultiplier.SINGLE, Scrabble.LetterMultiplier.SINGLE, Scrabble.LetterMultiplier.DOUBLE, Scrabble.LetterMultiplier.SINGLE);
        scrabble = new Scrabble("double", Scrabble.WordMultiplier.DOUBLE, letterMultipliers);
        assertEquals(261, scrabble.getScore());
    }
}