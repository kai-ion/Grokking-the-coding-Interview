class MissingNumber {

  public static int findMissingNumber(int[] nums) {
    // TODO: Write your code here
    int len = nums.length;
    int i = 0;

    while (i < len) {
      int j = nums[i];
      if (nums[i] < len && nums[i] != i) {
        swap(nums, i, j);
      }
      else {
        i++;
      }
    }

    for (i = 0; i < len; i++) {
      if (nums[i] != i) {
        return i;
      }
    }


    return len;
  }

  
  static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }


  public static void main(String[] args) {
    System.out.println(MissingNumber.findMissingNumber(new int[] { 4, 0, 3, 1 }));
    System.out.println(MissingNumber.findMissingNumber(new int[] { 8, 3, 5, 2, 4, 6, 0, 1 }));
  }
}
