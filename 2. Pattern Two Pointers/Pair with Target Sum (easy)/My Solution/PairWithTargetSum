class PairWithTargetSum {

    public static int[] search(int[] arr, int targetSum) {
      // TODO: Write your code here
      int p1 = 0, p2 = arr.length - 1;
      int sum;

      for (int i = 0; i <= p2; i++) {
        sum = arr[p1] + arr[p2];
        if (sum == targetSum) {
          break;
        }

        else if (sum < targetSum) {
          p1++;
        }

        else if (sum > targetSum) {
          p2--;
        }

      }

      return new int[] { p1, p2 };
    }

    public static void main(String[] args) {
        int[] result = PairWithTargetSum.search(new int[] { 1, 2, 3, 4, 6 }, 6);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
        result = PairWithTargetSum.search(new int[] { 2, 5, 9, 11 }, 11);
        System.out.println("Pair with target sum: [" + result[0] + ", " + result[1] + "]");
      }
  }