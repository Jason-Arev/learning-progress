@SuppressWarnings("unused")
class NaturalNumber {
    private int number;
    
    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }

    Classification getClassification() {
        int aliquot = getAliquotSum(this.number);
    
        if (aliquot == number) return Classification.PERFECT;
        if (aliquot > number) return Classification.ABUNDANT;
        return Classification.DEFICIENT;
    }

    public int getAliquotSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

enum Classification {

    DEFICIENT, PERFECT, ABUNDANT

}
