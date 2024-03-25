import java.util.PriorityQueue;

public class KthLargestEle {

    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length)
            throw new IllegalArgumentException("Invalid input");

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) // If heap size exceeds K, remove the smallest element
                minHeap.poll();
        }

        return minHeap.peek(); // The root of the heap will be the Kth largest element
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int kthLargest = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + kthLargest);
    }
}
