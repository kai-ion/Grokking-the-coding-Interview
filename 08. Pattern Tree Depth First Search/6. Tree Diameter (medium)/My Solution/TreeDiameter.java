class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class TreeDiameter {

  public static int findDiameter(TreeNode root) {
    // TODO: Write your code here
    return -1;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(6);
    System.out.println("Tree Diameter: " + TreeDiameter.findDiameter(root));
    root.left.left = null;
    root.right.left.left = new TreeNode(7);
    root.right.left.right = new TreeNode(8);
    root.right.right.left = new TreeNode(9);
    root.right.left.right.left = new TreeNode(10);
    root.right.right.left.left = new TreeNode(11);
    System.out.println("Tree Diameter: " + TreeDiameter.findDiameter(root));
  }
}
