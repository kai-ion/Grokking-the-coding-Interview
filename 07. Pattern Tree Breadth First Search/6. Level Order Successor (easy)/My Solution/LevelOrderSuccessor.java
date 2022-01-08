import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class LevelOrderSuccessor {
  public static TreeNode findSuccessor(TreeNode root, int key) {
    // TODO: Write your code here
    if (root == null || key < 1) {
      return null;
    }

    Queue<TreeNode> queue = new LinkedList<>();

    queue.offer(root);


    while (!queue.isEmpty()) {

      int levelSize = queue.size();

      for (int i = 0; i < levelSize; i++) {
        TreeNode currentNode = queue.poll();

        

        if (currentNode.left != null) {
          queue.offer(currentNode.left);
        }
  
        if (currentNode.right != null) {
          queue.offer(currentNode.right);
        }

        if (currentNode.val == key) {
          return queue.peek();
        }
      }

      

    }

    return null;    
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(9);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    TreeNode result = LevelOrderSuccessor.findSuccessor(root, 12);
    if (result != null)
      System.out.println(result.val + " ");
    result = LevelOrderSuccessor.findSuccessor(root, 9);
    if (result != null)
      System.out.println(result.val + " ");
  }
}
