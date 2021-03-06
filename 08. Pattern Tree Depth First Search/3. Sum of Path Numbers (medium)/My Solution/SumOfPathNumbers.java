import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class SumOfPathNumbers {
  public static int findSumOfPathNumbers(TreeNode root) {
    // TODO: Write your code here
    return find_path_sum_recursive (root, 0);
  }

  private static int find_path_sum_recursive (TreeNode currentNode, int pathSum) {
    if (currentNode == null) {
      return 0;
    }

    pathSum = 10 * pathSum + currentNode.val;

    if (currentNode.left == null && currentNode.right == null) {
      return pathSum;
    }


    return find_path_sum_recursive(currentNode.left, pathSum) + find_path_sum_recursive(currentNode.right, pathSum);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(5);
    System.out.println("Total Sum of Path Numbers: " + SumOfPathNumbers.findSumOfPathNumbers(root));
  }
}
