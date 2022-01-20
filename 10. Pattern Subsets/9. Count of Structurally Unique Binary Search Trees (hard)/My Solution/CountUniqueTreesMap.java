import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
};

class CountUniqueTreesMap {
  HashMap<Integer, Integer> map = new HashMap<>();

  public int countTrees(int n) {
    if (n <= 1) {
      return 1;
    }

   if (map.containsKey(n)) {
     return map.get(n);
   }
   int count = 0;

   for (int i = 1; i <= n; i++) {
     int left = countTrees(i - 1);
     int right = countTrees(n - i);

     count += (left * right);
   }

   map.put(n, count);
   return count;
  }

  public static void main(String[] args) {
    CountUniqueTreesMap ct = new CountUniqueTreesMap();
    int count = ct.countTrees(3);
    System.out.print("Total trees: " + count);
  }
}
