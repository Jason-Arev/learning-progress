class Acronym {
    private final String acronym;

    @SuppressWarnings("unused")
    Acronym(String phrase) {
        String[] words = phrase.split("[\\s-]+"); // split on space or hyphen
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        acronym = sb.toString();
    }

    @SuppressWarnings("unused")
    String get() {
        return acronym;
    }
}
