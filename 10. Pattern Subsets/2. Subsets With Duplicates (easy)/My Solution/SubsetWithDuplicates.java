import java.util.*;

class SubsetWithDuplicates {

  public static List<List<Integer>> findSubsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    // TODO: Write your code here   
    return subsets;
  }

  public static void main(String[] args) {
    List<List<Integer>> result = SubsetWithDuplicates.findSubsets(new int[] { 1, 3, 3 });
    System.out.println("Here is the list of subsets: " + result);

    result = SubsetWithDuplicates.findSubsets(new int[] { 1, 5, 3, 3 });
    System.out.println("Here is the list of subsets: " + result);
  }
}
