package exercims.Grains;

import java.math.BigInteger;

public class Grains {
    
    @SuppressWarnings("unused")
    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("Square must be between 1 and 64");
        }
        return BigInteger.valueOf(2).pow(square - 1);
    }

    @SuppressWarnings("unused")
    BigInteger grainsOnBoard() {
        return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    }
}
