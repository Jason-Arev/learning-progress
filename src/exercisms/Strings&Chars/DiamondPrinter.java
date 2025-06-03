import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class DiamondPrinter {

    List<String> printToList(char target) {
        List<String> diamond = new ArrayList<>();
        int size = target - 'A';
        int width = size * 2 + 1;

        for (int i = 0; i <= size; i++) {
            diamond.add(buildRow(i, size));
        }
        for (int i = size - 1; i >= 0; i--) {
            diamond.add(buildRow(i, size));
        }

        return diamond;
    }

    private String buildRow(int row, int size) {
        char letter = (char) ('A' + row);
        int outerSpaces = size - row;
        int innerSpaces = row == 0 ? 0 : row * 2 - 1;

        StringBuilder sb = new StringBuilder();

        // Leading spaces
        sb.append(" ".repeat(outerSpaces));

        sb.append(letter);

        if (row != 0) {
            sb.append(" ".repeat(innerSpaces));
            sb.append(letter);
        }

        // Trailing spaces
        sb.append(" ".repeat(outerSpaces));

        return sb.toString();
    }
}