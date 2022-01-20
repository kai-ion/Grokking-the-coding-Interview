import java.util.*;

class PermutationsRecursive {

  public static List<List<Integer>> generatePermutations(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    generatePermutationsRecursive(nums, 0, new ArrayList<Integer>(), result);
    return result;
  }

  private static void generatePermutationsRecursive(int[] nums, int index, 
      List<Integer> currentPerm, List<List<Integer>> result) {

      if (index == nums.length) {
        result.add(currentPerm);
      }
      else {
        int len = currentPerm.size();
        for (int i = 0; i <= len; i++) {
          ArrayList<Integer> newPerm = new ArrayList<>(currentPerm);

          newPerm.add(i, nums[index]);

          generatePermutationsRecursive(nums, index + 1, newPerm, result);
        }

      }
      
  }

  public static void main(String[] args) {
    List<List<Integer>> result = PermutationsRecursive.findPermutations(new int[] { 1, 3, 5 });
    System.out.print("Here are all the permutations: " + result);
  }
}
