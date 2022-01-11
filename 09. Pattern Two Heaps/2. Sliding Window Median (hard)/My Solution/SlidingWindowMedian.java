import java.util.*;

class SlidingWindowMedian {

  PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
  PriorityQueue<Integer> minHeap = new PriorityQueue<>();

  public double[] findSlidingWindowMedian(int[] nums, int k) {
    double[] result = new double[nums.length - k + 1];
    // TODO: Write your code here
    int len = nums.length;

    for (int i = 0; i < len; i++) {
      int n = nums[i];

      if (maxHeap.size() == 0 || n <= maxHeap.peek()) {
        maxHeap.add(n);
      }
      else {
        minHeap.add(n);
      }

      balance_heaps();
      
      if (i - k + 1 >= 0) {

        if (maxHeap.size() == minHeap.size()) {
          result[i - k + 1] = (maxHeap.peek() + minHeap.peek()) / 2.0; 
        }
        else {
          result[i - k + 1] = maxHeap.peek();
        }

        int numOut = nums[i - k + 1];
        if (maxHeap.peek() >= numOut) {
          maxHeap.remove(numOut);
        }
        else {
          minHeap.remove(numOut);
        }
        
        balance_heaps();
      }

      

    }

    return result;
  }

  private  void balance_heaps() {

    if (maxHeap.size() > minHeap.size() + 1) {
      minHeap.add(maxHeap.poll());
    }
    else if (minHeap.size() > maxHeap.size()) {
      maxHeap.add(minHeap.poll());
    }

  }

  public static void main(String[] args) {
    SlidingWindowMedian slidingWindowMedian = new SlidingWindowMedian();
    double[] result = slidingWindowMedian.findSlidingWindowMedian(new int[] { 1, 2, -1, 3, 5 }, 2);
    System.out.print("Sliding window medians are: ");
    for (double num : result)
      System.out.print(num + " ");
    System.out.println();

    slidingWindowMedian = new SlidingWindowMedian();
    result = slidingWindowMedian.findSlidingWindowMedian(new int[] { 1, 2, -1, 3, 5 }, 3);
    System.out.print("Sliding window medians are: ");
    for (double num : result)
      System.out.print(num + " ");
  }

}