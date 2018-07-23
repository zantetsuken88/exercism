class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] words = phrase.split("\\W+");

        StringBuilder acronym = new StringBuilder();

        for (String s : words) {
            acronym.append(s.toCharArray()[0]);
        }
        return acronym.toString().toUpperCase();
    }

}
