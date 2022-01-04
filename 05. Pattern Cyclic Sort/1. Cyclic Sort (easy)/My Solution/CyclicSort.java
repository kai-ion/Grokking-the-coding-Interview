class CyclicSort {

  public static void sort(int[] nums) {
    // TODO: Write your code here    
    int i = 0;
    int len = nums.length;

    while (i < len) {
      int j = nums[i] - 1;
      if (nums[i] != i + 1) {
        swap(i, j, nums);
      }

      else {

        i++;
      }
    }

  }

  static void swap (int i, int j, int[] nums) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 3, 1, 5, 4, 2 };
    CyclicSort.sort(arr);
    for (int num : arr)
      System.out.print(num + " ");
    System.out.println();

    arr = new int[] { 2, 6, 4, 3, 1, 5 };
    CyclicSort.sort(arr);
    for (int num : arr)
      System.out.print(num + " ");
    System.out.println();

    arr = new int[] { 1, 5, 6, 4, 3, 2 };
    CyclicSort.sort(arr);
    for (int num : arr)
      System.out.print(num + " ");
    System.out.println();
  }
}
