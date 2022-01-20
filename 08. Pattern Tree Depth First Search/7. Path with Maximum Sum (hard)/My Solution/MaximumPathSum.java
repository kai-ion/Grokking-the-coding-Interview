class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class MaximumPathSum {

  private static int maxSumPath;
  
  public static int findMaximumPathSum(TreeNode root) {
    // TODO: Write your code here
    maxSumPath = Integer.MIN_VALUE;

    maxSumPath = Math.max(findMaximumPathSumRecursive(root), maxSumPath);

    return maxSumPath;
  }

  private static int findMaximumPathSumRecursive(TreeNode currentNode) {

    if (currentNode == null) {
      return 0;
    }

    int leftPathSum = findMaximumPathSumRecursive(currentNode.left);
    int rightPathSum = findMaximumPathSumRecursive(currentNode.right);

    leftPathSum = Math.max(leftPathSum, 0);
    rightPathSum = Math.max(rightPathSum, 0);
    

    int pathSum = leftPathSum + rightPathSum + currentNode.val;

    maxSumPath = Math.max(pathSum, maxSumPath);
    

    return Math.max(leftPathSum, rightPathSum) + currentNode.val;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    System.out.println("Maximum Path Sum: " + MaximumPathSum.findMaximumPathSum(root));
    
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    root.right.left.left = new TreeNode(7);
    root.right.left.right = new TreeNode(8);
    root.right.right.left = new TreeNode(9);
    System.out.println("Maximum Path Sum: " + MaximumPathSum.findMaximumPathSum(root));
    
    root = new TreeNode(-1);
    root.left = new TreeNode(-3);
    System.out.println("Maximum Path Sum: " + MaximumPathSum.findMaximumPathSum(root));
  }
}
