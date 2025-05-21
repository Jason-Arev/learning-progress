class RNATranscription {

    @SuppressWarnings("unused")
    String transcribe(String dnaStrand) {
        char[] dna = dnaStrand.toCharArray();
        for (int i = 0; i < dna.length; i++) {
            dna[i] = translate(dna[i]);
        }
        return new String(dna);
    }


    char translate(char n) {
        return switch (n) {
            case 'G' -> 'C';
            case 'C' -> 'G';
            case 'T' -> 'A';
            case 'A' -> 'U';
            default -> ' ';
        };
    }

}