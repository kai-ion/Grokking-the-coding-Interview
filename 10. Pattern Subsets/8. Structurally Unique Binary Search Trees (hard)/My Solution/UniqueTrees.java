import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class UniqueTrees {
  public static List<TreeNode> findUniqueTrees(int n) {
    if (n <= 0) {
      return new ArrayList<TreeNode>();
    }
    // TODO: Write your code here
    return findUniqueTreesRecursive(1, n);
  }

  public static List<TreeNode> findUniqueTreesRecursive(int start, int end) {
    List<TreeNode> result = new ArrayList<>();

    if (start > end) {
      result.add(null);
      return result;
    }

    for (int i = start; i <= end; i++) {
      List<TreeNode> left = findUniqueTreesRecursive(start, i - 1);
      List<TreeNode> right = findUniqueTreesRecursive(i + 1, end);

      for (TreeNode L : left) {
        for (TreeNode R : right) {
          TreeNode root = new TreeNode(i);
          root.left = L;
          root.right = R;
          result.add(root);

        }
      }

    }

    return result;
  }

  public static void main(String[] args) {
    List<TreeNode> result = UniqueTrees.findUniqueTrees(3);
    System.out.print("Total trees: " + result.size());
  }
}
