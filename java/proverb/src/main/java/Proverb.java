import java.util.Arrays;

class Proverb {

    private String[] words;

    Proverb(String[] words) {

        this.words = words;
    }

    String recite() {

        StringBuilder proverb = new StringBuilder();

        if (words.length != 0) {

            for (String word : words) {
                if ((Arrays.asList(words).indexOf(word)) <= (words.length - 2)) {
                    String lost = words[(Arrays.asList(words).indexOf(word)) + 1];
                    proverb.append("For want of a " + word + " the " + lost + " was lost.\n");
                }
            }

            proverb.append("And all for the want of a " + words[0] + ".");

        }
        return proverb.toString();
    }

}