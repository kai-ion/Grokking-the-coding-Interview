class FindCorruptNums {

  public static int[] findNumbers(int[] nums) {
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

    for (i = 0; i< len; i++) {
      if (nums[i] != i + 1) {
        return new int[] {nums[i], i + 1};
      }
    }

    return new int[] { -1, -1 };
  }

  static void swap (int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = FindCorruptNums.findNumbers(new int[] { 3, 1, 2, 5, 2 });
    System.out.println(nums[0] + ", " + nums[1]);
    nums = FindCorruptNums.findNumbers(new int[] { 3, 1, 2, 3, 6, 4 });
    System.out.println(nums[0] + ", " + nums[1]);
  }
}
