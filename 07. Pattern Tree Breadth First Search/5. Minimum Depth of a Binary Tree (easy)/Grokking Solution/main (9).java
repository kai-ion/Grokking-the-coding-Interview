import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class MinimumBinaryTreeDepth {
  public static int findDepth(TreeNode root) {
    if (root == null)
      return 0;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int minimumTreeDepth = 0;
    while (!queue.isEmpty()) {
      minimumTreeDepth++;
      int levelSize = queue.size();
      for (int i = 0; i < levelSize; i++) {
        TreeNode currentNode = queue.poll();

        // check if this is a leaf node
        if (currentNode.left == null && currentNode.right == null)
          return minimumTreeDepth;

        // insert the children of current node in the queue
        if (currentNode.left != null)
          queue.add(currentNode.left);
        if (currentNode.right != null)
          queue.add(currentNode.right);
      }
    }
    return minimumTreeDepth;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    System.out.println("Tree Minimum Depth: " + MinimumBinaryTreeDepth.findDepth(root));
    root.left.left = new TreeNode(9);
    root.right.left.left = new TreeNode(11);
    System.out.println("Tree Minimum Depth: " + MinimumBinaryTreeDepth.findDepth(root));
  }
}
