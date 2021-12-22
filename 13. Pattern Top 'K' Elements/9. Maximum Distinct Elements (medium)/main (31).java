import java.util.*;

class MaximumDistinctElements {

  public static int findMaximumDistinctElements(int[] nums, int k) {
    // TODO: Write your code here
    return -1;
  }

  public static void main(String[] args) {
    int result = MaximumDistinctElements.findMaximumDistinctElements(new int[] { 7, 3, 5, 8, 5, 3, 3 }, 2);
    System.out.println("Maximum distinct numbers after removing K numbers: " + result);

    result = MaximumDistinctElements.findMaximumDistinctElements(new int[] { 3, 5, 12, 11, 12 }, 3);
    System.out.println("Maximum distinct numbers after removing K numbers: " + result);

    result = MaximumDistinctElements.findMaximumDistinctElements(new int[] { 1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5 }, 2);
    System.out.println("Maximum distinct numbers after removing K numbers: " + result);
  }
}