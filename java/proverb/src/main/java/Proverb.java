class Proverb {

    private String[] words;

    Proverb(String[] words) {

        this.words = words;
    }

    String recite() {

        StringBuilder proverb = new StringBuilder();

        if (words.length != 0) {

            for (int i = 0; i < (words.length - 1); i++) {
                String lost = words[i + 1];
                proverb.append("For want of a " + words[i] + " the " + lost + " was lost.\n");
            }

            proverb.append("And all for the want of a " + words[0] + ".");

        }
        return proverb.toString();
    }

}