import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class levelMax {
  public static List<Double> findlevelMaxs(TreeNode root) {
    List<Double> result = new ArrayList<>();
    // TODO: Write your code here
    if (root == null) {
      return result;
    }
    
    Queue<TreeNode> queue = new LinkedList<>();

    queue.offer(root);

    while (!queue.isEmpty()) {

      int levelSize = queue.size();
      double max = Integer.MIN_VALUE;

      for (int i = 0; i < levelSize; i++) {

        TreeNode currentNode = queue.poll();

        max = Math.max(max, currentNode.val);

        if (currentNode.left != null) {
          queue.offer(currentNode.left);
        }

        if (currentNode.right != null) {
          queue.offer(currentNode.right);
        }


      }

      result.add(max);

    }

    
    return result;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(9);
    root.left.right = new TreeNode(2);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    List<Double> result = levelMax.findlevelMaxs(root);
    System.out.print("Level averages are: " + result);
  }
}
