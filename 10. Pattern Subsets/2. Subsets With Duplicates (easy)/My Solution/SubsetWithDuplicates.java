import java.util.*;

class SubsetWithDuplicates {

  public static List<List<Integer>> findSubsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    // TODO: Write your code here   
    int len = nums.length;

    subsets.add(new ArrayList<>());

    int start, end = 0;
    for (int i = 0; i < len; i++) {

      
      start = 0;

      if (i > 0 && nums[i] == nums[i - 1]) {
        start = end + 1;
      }

      end = subsets.size();

      for (int j = start; j < end; j++) {           
        ArrayList<Integer> set = new ArrayList<>(subsets.get(j));
        set.add(nums[i]);

        subsets.add(set);
      }

    }


    return subsets;
  }

  public static void main(String[] args) {
    List<List<Integer>> result = SubsetWithDuplicates.findSubsets(new int[] { 1, 3, 3 });
    System.out.println("Here is the list of subsets: " + result);

    result = SubsetWithDuplicates.findSubsets(new int[] { 1, 5, 3, 3 });
    System.out.println("Here is the list of subsets: " + result);
  }
}
