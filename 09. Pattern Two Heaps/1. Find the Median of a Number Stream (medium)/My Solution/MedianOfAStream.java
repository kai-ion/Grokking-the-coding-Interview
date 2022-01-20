import java.util.*;

class MedianOfAStream {

  Queue<Integer> maxHeap;
  Queue<Integer> minHeap;

  public MedianOfAStream() {
    maxHeap = new PriorityQueue<>((a , b) -> b - a);
    minHeap = new PriorityQueue<>((a , b) -> a - b);
  }

  public void insertNum(int num) {
    // TODO: Write your code here
    if (maxHeap.isEmpty() || maxHeap.peek() >= num) {
      maxHeap.offer(num);
    }
    else {
      minHeap.offer(num);
    }

    if (maxHeap.size() > minHeap.size() + 1) {
      minHeap.offer(maxHeap.poll());
    }

    if (maxHeap.size() < minHeap.size()) {
      maxHeap.offer(minHeap.poll());
    }

  }

  public double findMedian() {
    // TODO: Write your code here
    if (maxHeap.size() == minHeap.size()) {
      return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }

    return maxHeap.peek();
  }

  public static void main(String[] args) {
    MedianOfAStream medianOfAStream = new MedianOfAStream();
    medianOfAStream.insertNum(3);
    medianOfAStream.insertNum(1);
    System.out.println("The median is: " + medianOfAStream.findMedian());
    medianOfAStream.insertNum(5);
    System.out.println("The median is: " + medianOfAStream.findMedian());
    medianOfAStream.insertNum(4);
    System.out.println("The median is: " + medianOfAStream.findMedian());
  }
}
