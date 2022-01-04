class FindDuplicate {

  public static int findNumber(int[] nums) {
    // TODO: Write your code here
    int i = 0;
    int len = nums.length;

    while (i < len) {
      int j = nums[i] - 1;
      if (nums[i] != i + 1) {
        if (nums[i] != nums[j]) {
          swap(nums, i, j);
        }
        else {
          return nums[i];
        }
      }
      else {
        i++;
      }
    }

    return -1;
  }

  static void swap (int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    System.out.println(FindDuplicate.findNumber(new int[] { 1, 4, 4, 3, 2 }));
    System.out.println(FindDuplicate.findNumber(new int[] { 2, 1, 3, 3, 5, 4 }));
    System.out.println(FindDuplicate.findNumber(new int[] { 2, 4, 1, 4, 4 }));
  }
}
