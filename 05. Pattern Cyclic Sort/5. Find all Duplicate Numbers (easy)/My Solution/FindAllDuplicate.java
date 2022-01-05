import java.util.*;

class FindAllDuplicate {

  public static List<Integer> findNumbers(int[] nums) {
    List<Integer> duplicateNumbers = new ArrayList<>();
    // TODO: Write your code here
    int i = 0;
    int len = nums.length;

    while (i < len) {
      int j = nums[i] - 1;
      if (nums[i] != nums[j]) {
        swap(nums, i, j);
      }
      else {
        i++;
      }
    }

    for (i = 0; i < len; i++) {
      if (nums[i] != i + 1) {
        duplicateNumbers.add(nums[i]);
      }
    }
    
    return duplicateNumbers;
  }

  static void swap (int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    List<Integer> duplicates = FindAllDuplicate.findNumbers(new int[] { 3, 4, 4, 5, 5 });
    System.out.println("Duplicates are: " + duplicates);

    duplicates = FindAllDuplicate.findNumbers(new int[] { 5, 4, 7, 2, 3, 5, 3 });
    System.out.println("Duplicates are: " + duplicates);
  }
}
