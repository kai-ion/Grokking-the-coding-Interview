class TargetSum {

  public int findTargetSubsets(int[] num, int s) {
    // TODO: Write your code here 
    return -1;
  }
  
  public static void main(String[] args) {
    TargetSum ts = new TargetSum();
    int[] num = {1, 1, 2, 3};
    System.out.println(ts.findTargetSubsets(num, 1));
    num = new int[]{1, 2, 7, 1};
    System.out.println(ts.findTargetSubsets(num, 9));
  }
}
