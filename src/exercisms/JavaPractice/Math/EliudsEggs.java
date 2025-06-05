public class EliudsEggs {
    public int eggCount(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 == 1) { // last bit is 1
                count++;
            }
            number = number / 2; // shift right by 1
        }
        return count;
    }
}
