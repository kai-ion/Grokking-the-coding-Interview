class PartitionSet {

  public int canPartition(int[] num) {
    return this.canPartitionRecursive(num, 0, 0, 0);
  }

  private int canPartitionRecursive(int[] num, int currentIndex, int sum1, int sum2) {
    // base check
    if (currentIndex == num.length)
      return Math.abs(sum1 - sum2);

    // recursive call after including the number at the currentIndex in the first set
    int diff1 = canPartitionRecursive(num, currentIndex+1, sum1+num[currentIndex], sum2);

    // recursive call after including the number at the currentIndex in the second set
    int diff2 = canPartitionRecursive(num, currentIndex+1, sum1, sum2+num[currentIndex]);

    return Math.min(diff1, diff2);
  }

  public static void main(String[] args) {
    PartitionSet ps = new PartitionSet();
    int[] num = {1, 2, 3, 9};
    System.out.println(ps.canPartition(num));
    num = new int[]{1, 2, 7, 1, 5};
    System.out.println(ps.canPartition(num));
    num = new int[]{1, 3, 100, 4};
    System.out.println(ps.canPartition(num));
  }
}