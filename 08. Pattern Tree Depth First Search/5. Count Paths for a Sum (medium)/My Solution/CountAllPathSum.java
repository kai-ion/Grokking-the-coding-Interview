import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class CountAllPathSum {
  public static int countPaths(TreeNode root, int S) {
    // TODO: Write your code here
    List<Integer> currentPath = new ArrayList<>();

    return countPathsRecursive(root, S, currentPath);
  }

  private static int countPathsRecursive(TreeNode currentNode, int sum, List<Integer> currentPath) {
    
    if (currentNode == null) {
      return 0;
    }

    int pathSum = 0;
    int pathCount = 0;
    currentPath.add(currentNode.val);

    ListIterator<Integer> itr = currentPath.listIterator(currentPath.size()); 
    while (itr.hasPrevious()) {
      pathSum += itr.previous();

      if (pathSum == sum) {
        pathCount++;
      }
    }

    pathCount += countPathsRecursive(currentNode.left, sum, currentPath);

    pathCount += countPathsRecursive(currentNode.right, sum, currentPath);

    currentPath.remove(currentPath.size() - 1);

    return pathCount;
  }
  
  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    System.out.println("Tree has path: " + CountAllPathSum.countPaths(root, 11));
  }
}
