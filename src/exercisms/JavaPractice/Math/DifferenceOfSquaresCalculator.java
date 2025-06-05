class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = input * (input + 1) / 2;
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for (int i = 1; i <= input; i++) {
            sumOfSquares += i * i;
        }
        return sumOfSquares;
    }

    @SuppressWarnings("unused")
    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}