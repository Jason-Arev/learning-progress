import java.util.*;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
        this.heap.add(0); // Dummy value at index 0
    }

    public Integer pop() {
        if (heap.size() <= 1) return - 1;
        if (heap.size() == 2) return heap.remove(1);

        int root = heap.get(1);
        heap.set(1, heap.remove(heap.size() - 1)); 
        if (heap.size() > 1) {
            bubbleDown(1);
        }
        return root;
    }

    public void push(int val) {
        heap.add(val);
        bubbleUp(heap.size() - 1);
    }

    @SuppressWarnings("null")
    public Integer top() {
        return heap.size() > 1 ? heap.get(1) : -1;
    }

    public void heapify(List<Integer> nums) {
        this.heap = new ArrayList<>();
        this.heap.add(0);
        this.heap.addAll(nums);

        for (int i = heap.size() / 2; i >= 1; i--) {
            bubbleDown(i);
        }
    }

    private void bubbleUp(int index) {
        int parent = index / 2;
        while (index > 1 && heap.get(parent) > heap.get(index)) {
            swap (index, parent);
            index = parent;
            parent = index / 2;
        }
    }

    private void bubbleDown(int index) {    
        int child = index * 2;
        while (child < heap.size()) {
            if (child + 1 < heap.size() && heap.get(child) > heap.get(child + 1)) {
                child++;
            }

            if (heap.get(index) <= heap.get(child)) break;

            swap(index, child);
            index = child;
            child = index * 2;
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    
}
