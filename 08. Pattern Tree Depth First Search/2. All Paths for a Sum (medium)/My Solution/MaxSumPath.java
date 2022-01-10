import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class Max {
  int MaxSum = Integer.MIN_VALUE;
}

class MaxSumPath {
  public static List<List<Integer>> findPaths(TreeNode root, int sum) {
    List<List<Integer>> allPaths = new ArrayList<>();
    // TODO: Write your code here
    List<Integer> currentPath = new ArrayList<>();
    Max MaxSum = new Max();
    sum = 0;
    find_Paths_Recursive(root, MaxSum, sum, allPaths, currentPath);

    return allPaths;
  }

  static void find_Paths_Recursive(TreeNode currentNode, Max MaxSum, int sum,
    List<List<Integer>> allPaths, List<Integer> currentPath) {
      if (currentNode == null) {
        return;
      }
      
      currentPath.add(currentNode.val);

      if (MaxSum.MaxSum < sum + currentNode.val && currentNode.left == null && currentNode.right == null) {
        allPaths.add(new ArrayList<Integer>(currentPath));
        MaxSum.MaxSum = sum + currentNode.val;
      }
      else {

        find_Paths_Recursive(currentNode.left, MaxSum, sum + currentNode.val, allPaths, currentPath);

        find_Paths_Recursive(currentNode.right, MaxSum, sum + currentNode.val, allPaths, currentPath);
      }


      currentPath.remove(currentPath.size() - 1);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    int sum = 23;
    List<List<Integer>> result = MaxSumPath.findPaths(root, sum);
    System.out.println("Tree paths with Max sum: " + result.get(result.size() - 1));
  }
}
