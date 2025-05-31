import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    @SuppressWarnings("unused")
    List<String> translate(String rnaSequence) {
        if (rnaSequence == null)
            throw new IllegalArgumentException("Invalid codon");
    
        List<String> translated = new ArrayList<>();
        boolean sawStop = false;
    
        int i = 0;
        for (; i + 2 < rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, i + 3);
            String aminoAcid = rna(codon);
    
            if (aminoAcid.isEmpty())
                throw new IllegalArgumentException("Invalid codon");
    
            if (aminoAcid.equals("STOP")) {
                sawStop = true;
                break;
            }
    
            translated.add(aminoAcid);
        }
    
        // Check if leftover chars exist after the last full codon
        if ((i + 3) > rnaSequence.length() && !sawStop && rnaSequence.length() % 3 != 0) {
            throw new IllegalArgumentException("Invalid codon");
        }
    
        return translated;
    }

    private String rna(String subSequence) {
        return switch (subSequence) {
            case "AUG" -> "Methionine";
            case "UUU", "UUC" -> "Phenylalanine";
            case "UUA", "UUG" -> "Leucine";
            case "UCU", "UCC", "UCA", "UCG" -> "Serine";
            case "UAU", "UAC" -> "Tyrosine";
            case "UGU", "UGC" -> "Cysteine";
            case "UGG" -> "Tryptophan";
            case "UAA", "UAG", "UGA" -> "STOP";
            default -> "";
        };
    }
}
