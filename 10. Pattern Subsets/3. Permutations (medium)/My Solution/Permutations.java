import java.util.*;

class Permutations {

  public static List<List<Integer>> findPermutations(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    // TODO: Write your code here

    Queue<List<Integer>> permutations = new LinkedList<>();

    permutations.add(new ArrayList<>() );
    int len = nums.length;

    for (int num : nums) {

      int lenPerm = permutations.size();
      for (int i = 0; i < lenPerm; i++) {
        List<Integer> oldPermutation = permutations.poll();

        for(int j = 0; j <= oldPermutation.size(); j++) {
          List<Integer> newPermutation = new ArrayList<Integer>(oldPermutation);

          newPermutation.add(j, num);

          if (newPermutation.size() == len) {
            result.add(newPermutation);
          }
          else {
            permutations.add(newPermutation);
          }
        }
      }

    }

    return result;
  }

  public static void main(String[] args) {
    List<List<Integer>> result = Permutations.findPermutations(new int[] { 1, 3, 5 });
    System.out.print("Here are all the permutations: " + result);
  }
}
