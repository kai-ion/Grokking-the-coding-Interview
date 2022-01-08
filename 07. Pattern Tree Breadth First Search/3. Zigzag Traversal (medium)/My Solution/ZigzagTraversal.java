import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class ZigzagTraversal {
  public static List<List<Integer>> traverse(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    // TODO: Write your code here
    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue= new LinkedList<>();

    queue.offer(root);
    Boolean leftRight = true;
    
    while (!queue.isEmpty()) {

      int levelSize = queue.size();
      
      LinkedList<Integer> currentLevel = new LinkedList<>();


      for (int i = 0; i < levelSize; i++) {

        TreeNode currentNode = queue.poll();
        
        if (leftRight) {
          currentLevel.add(currentNode.val);
        }
        else
          currentLevel.add(0, currentNode.val);

        if (currentNode.left != null) {
          queue.offer(currentNode.left);
        }

        if (currentNode.right != null) {
          queue.offer(currentNode.right);
        }


      }

      leftRight = !leftRight;
      result.add(currentLevel);
    }

    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(9);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    root.right.left.left = new TreeNode(20);
    root.right.left.right = new TreeNode(17);
    List<List<Integer>> result = ZigzagTraversal.traverse(root);
    System.out.println("Zigzag traversal: " + result);
  }
}
