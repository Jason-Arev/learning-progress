import java.util.PriorityQueue;

/**
 * Kth Largest Element in a Stream
 * 
 * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * 
 * Implement KthLargest class:
 * 
 * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums. 
 * int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.
 */
public class KthLargest {
    private final int k; //the rank of the largest element we want to find
    private final PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();

        for (int num :nums) {
            minHeap.offer(num); // add the number to the heap
            if (minHeap.size() > k) { // if the size of the heap exceeds k, remove the smallest element
                minHeap.poll();
            }
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek(); // return index 0
    }
}
