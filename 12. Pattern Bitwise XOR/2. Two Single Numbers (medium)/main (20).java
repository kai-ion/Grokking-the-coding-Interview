class TwoSingleNumbers {

  public static int[] findSingleNumbers(int[] nums) {
    // TODO: Write your code here
    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 4, 2, 1, 3, 5, 6, 2, 3, 5 };
    int[] result = TwoSingleNumbers.findSingleNumbers(arr);
    System.out.println("Single numbers are: " + result[0] + ", " + result[1]);

    arr = new int[] { 2, 1, 3, 2 };
    result = TwoSingleNumbers.findSingleNumbers(arr);
    System.out.println("Single numbers are: " + result[0] + ", " + result[1]);
  }
}
