public class SelectionSort {

    public void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i; // save i
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
    
}
