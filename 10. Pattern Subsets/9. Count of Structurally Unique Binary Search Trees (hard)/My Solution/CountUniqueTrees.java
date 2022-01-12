import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class CountUniqueTrees {
  public int countTrees(int n) {
    // TODO: Write your code here
    return -1;
  }
  
  public static void main(String[] args) {
   CountUniqueTrees ct = new CountUniqueTrees();
    int count = ct.countTrees(3);
    System.out.print("Total trees: " + count);
  }
}
