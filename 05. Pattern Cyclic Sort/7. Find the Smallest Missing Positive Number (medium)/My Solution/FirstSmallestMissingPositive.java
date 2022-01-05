class FirstSmallestMissingPositive {

  public static int findNumber(int[] nums) {
    // TODO: Write your code here
    int len = nums.length;
    int i = 0;

    while (i < len) {
      int j = nums[i] - 1;
      if (nums[i] > 0 && nums[i] < len && nums[i] != nums[j]) {
        swap(nums, i, j);
      }
      else {
        i++;
      }
    }

    for (i = 0; i < len; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
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
    System.out.println(FirstSmallestMissingPositive.findNumber(new int[] { -3, 1, 5, 4, 2 }));
    System.out.println(FirstSmallestMissingPositive.findNumber(new int[] { 3, -2, 0, 1, 2 }));
    System.out.println(FirstSmallestMissingPositive.findNumber(new int[] { 3, 2, 5, 1 }));
  }
}
