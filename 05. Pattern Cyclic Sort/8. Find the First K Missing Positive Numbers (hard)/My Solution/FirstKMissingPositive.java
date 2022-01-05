import java.util.*;

class FirstKMissingPositive {

  public static List<Integer> findNumbers(int[] nums, int k) {
    List<Integer> missingNumbers = new ArrayList<>();
    // TODO: Write your code here
    int i = 0;
    int len = nums.length;

    while (i < len) {
      int j = nums[i] - 1;
      if (nums[i] > 0 && nums[i] <= len && nums[i] != nums[j]) {
        swap(nums, i, j);
      }
      else {
        i++;
      }
    }

    Set<Integer> extraNums = new HashSet<>();
    for (i = 0; i < len && missingNumbers.size() < k; i++) {
      if(nums[i] != i + 1) {
        missingNumbers.add(i + 1);
        extraNums.add(nums[i]);
      }
    }

    for (i = 1; missingNumbers.size() < k; i++) {
      int num = i + len;

      if (!extraNums.contains(num)) {
        missingNumbers.add(num);
      }
    }

    return missingNumbers;
  }

  static void swap (int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  
  public static void main(String[] args) {
    List<Integer> missingNumbers = FirstKMissingPositive.findNumbers(new int[] { 3, -1, 4, 5, 5 }, 3);
    System.out.println("Missing numbers: " + missingNumbers);

    missingNumbers = FirstKMissingPositive.findNumbers(new int[] { 2, 3, 4 }, 3);
    System.out.println("Missing numbers: " + missingNumbers);

    missingNumbers = FirstKMissingPositive.findNumbers(new int[] { -2, -3, 4 }, 2);
    System.out.println("Missing numbers: " + missingNumbers);
  }
}