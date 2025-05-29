public class MergeSort {

    public int[] sort(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int[] res = mergeSort(nums, l, r);
        return res;
    }
    
    
    public static int[] mergeSort(int[] nums, int l, int r) { // merge   elements in a range of an array
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(nums, l, m); //divide left
            mergeSort(nums, m + 1, r); //divide right
            merge(nums, l, m, r); // merge sort all once all are divided
        }
        return nums;
    }


    private static void merge(int[] nums, int l, int m, int r) { 
        int l1 = m - l + 1;
        int l2 = r - m;

        int L[] = new int[l1];
        int R[] = new int[l2];

        for (int i = 0; i < l1; i++) {
            L[i] = nums[l + i];
        }
        for (int j = 0; j < l2; j++) {
            R[j] = nums[m + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while (i < l1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        while (j < l2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }
}
