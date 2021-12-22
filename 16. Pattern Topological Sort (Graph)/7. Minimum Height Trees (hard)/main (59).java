import java.util.*;

class MinimumHeightTrees {
  public static List<Integer> findTrees(int nodes, int[][] edges) {
    List<Integer> minHeightTrees = new ArrayList<>();
    // TODO: Write your code here
    return minHeightTrees;
  }

  public static void main(String[] args) {
    List<Integer> result = MinimumHeightTrees.findTrees(5,
        new int[][] { new int[] { 0, 1 }, new int[] { 1, 2 }, new int[] { 1, 3 }, new int[] { 2, 4 } });
    System.out.println("Roots of MHTs: " + result);

    result = MinimumHeightTrees.findTrees(4,
        new int[][] { new int[] { 0, 1 }, new int[] { 0, 2 }, new int[] { 2, 3 } });
    System.out.println("Roots of MHTs: " + result);

    result = MinimumHeightTrees.findTrees(4,
        new int[][] { new int[] { 0, 1 }, new int[] { 1, 2 }, new int[] { 1, 3 } });
    System.out.println("Roots of MHTs: " + result);
  }
}