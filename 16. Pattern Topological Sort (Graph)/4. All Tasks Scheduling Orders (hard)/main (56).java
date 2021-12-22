import java.util.*;

class AllTaskSchedulingOrders {
  public static void printOrders(int tasks, int[][] prerequisites) {
    // TODO: Write your code here
  }

  public static void main(String[] args) {
    AllTaskSchedulingOrders.printOrders(3, new int[][] { new int[] { 0, 1 }, new int[] { 1, 2 } });
    System.out.println();

    AllTaskSchedulingOrders.printOrders(4,
        new int[][] { new int[] { 3, 2 }, new int[] { 3, 0 }, new int[] { 2, 0 }, new int[] { 2, 1 } });
    System.out.println();

    AllTaskSchedulingOrders.printOrders(6, new int[][] { new int[] { 2, 5 }, new int[] { 0, 5 }, new int[] { 0, 4 },
        new int[] { 1, 4 }, new int[] { 3, 2 }, new int[] { 1, 3 } });
    System.out.println();
  }
}