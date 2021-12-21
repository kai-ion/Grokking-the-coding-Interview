import java.util.*;

class KthLargestNumberInStream {
  
  public KthLargestNumberInStream(int[] nums, int k) {
    // TODO: Write your code here
  }

  public int add(int num) {
    // TODO: Write your code here
    return -1;
  }

  public static void main(String[] args) {
    int[] input = new int[] { 3, 1, 5, 12, 2, 11 };
    KthLargestNumberInStream kthLargestNumber = new KthLargestNumberInStream(input, 4);
    System.out.println("4th largest number is: " + kthLargestNumber.add(6));
    System.out.println("4th largest number is: " + kthLargestNumber.add(13));
    System.out.println("4th largest number is: " + kthLargestNumber.add(4));
  }
}