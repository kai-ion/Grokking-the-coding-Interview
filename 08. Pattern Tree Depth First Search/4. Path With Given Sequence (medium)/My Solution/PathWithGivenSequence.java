import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class PathWithGivenSequence {
  public static boolean findPath(TreeNode root, int[] sequence) {
    // TODO: Write your code here
    if (root == null) {
      return false;
    }

    return findPathRecursive(root, sequence, 0);
  }

  private static boolean findPathRecursive(TreeNode currentNode, int[] sequence, int sequenceId) {
    
    if (currentNode == null) {
      return false;
    }

    if (sequenceId >= sequence.length || currentNode.val != sequence[sequenceId]) {
      return false;
    }

    if (sequence[sequenceId] == currentNode.val && currentNode.left == null && currentNode.right == null) {
      return true;
    }

    return findPathRecursive(currentNode.left, sequence, sequenceId + 1) || findPathRecursive(currentNode.right, sequence, sequenceId + 1);
  }
  
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(0);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(5);

    System.out.println("Tree has path sequence: " + PathWithGivenSequence.findPath(root, new int[] { 1, 0, 7 }));
    System.out.println("Tree has path sequence: " + PathWithGivenSequence.findPath(root, new int[] { 1, 1, 6 }));
  }
}
