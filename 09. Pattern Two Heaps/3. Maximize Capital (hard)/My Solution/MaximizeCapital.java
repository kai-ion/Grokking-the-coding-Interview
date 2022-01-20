import java.util.*;

class MaximizeCapital {

  

  public static int findMaximumCapital(int[] capital, int[] profits, int numberOfProjects, int initialCapital) {
    // TODO: Write your code here
    int len = profits.length;
    PriorityQueue<Integer> minCapital = new PriorityQueue<>(len, (a, b) -> capital[a] - capital[b]);
    PriorityQueue<Integer> maxProfit = new PriorityQueue<>(len, (a, b) -> profits[b] - profits[a]);

    for (int i = 0; i < len; i++) {
      minCapital.offer(i);
    }

    for (int i = 0; i < numberOfProjects; i++) {

      while (!minCapital.isEmpty() && initialCapital >= capital[minCapital.peek()]) {
        maxProfit.offer(minCapital.poll());
      }

      if (maxProfit.isEmpty()) {
        break;
      }

      initialCapital += profits[maxProfit.poll()];

    }

    return initialCapital;
  }

  public static void main(String[] args) {
    int result = MaximizeCapital.findMaximumCapital(new int[] { 0, 1, 2 }, new int[] { 1, 2, 3 }, 2, 1);
    System.out.println("Maximum capital: " + result);
    result = MaximizeCapital.findMaximumCapital(new int[] { 0, 1, 2, 3 }, new int[] { 1, 2, 3, 5 }, 3, 0);
    System.out.println("Maximum capital: " + result);
  }
}