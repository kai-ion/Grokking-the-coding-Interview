import java.util.*;

class QuadrupleSumToTarget {

  public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    // TODO: Write your code here
    Arrays.sort(arr);
    int n = arr.length;
    int p1 = 0;
    int p2 = n - 1;
    
    for (int i = 0; i < n - 3; i++) {
        while (i > 0 && arr[i] == arr[i-1]) {
            i++;
        }

        for (int j = i + 1; j < n -2; j++) {
            while (j > i + 1 && arr[j] == arr[j-1]) {
                j++;
            }
            
            find_Pairs(arr, quadruplets, i, j, target);
        }
    }


    return quadruplets;
  }

  public static void find_Pairs(int[] arr, List<List<Integer>> quadruplets, int first, int second, int target) {
    int p1 = second + 1;
    int p2 = arr.length - 1;;

    while (p1 < p2) {
        int sum = arr[p1] + arr[first] + arr[second] + arr[p2];

        if (sum == target) {
            quadruplets.add( Arrays.asList(arr[first], arr[second], arr[p1], arr[p2]) );
            p1++;
            p2--;

            while (p1 < p2 && arr[p2] == arr[p2+1]) {
                p2--;
            }

            while (p1 < p2 && arr[p1] == arr[p1-1]) {
                p1++;
            }
        }

        if ( sum > target ) {
            p2--;

            while (p1 < p2 && arr[p2] == arr[p2+1]) {
                p2--;
            }
        }

        if ( sum < target ) {
            p1++;

            while (p1 < p2 && arr[p1] == arr[p1-1]) {
                p1++;
            }
        }
    }
  }

  public static void main(String[] args) {
    System.out.println(QuadrupleSumToTarget.searchQuadruplets(new int[] { 4, 1, 2, -1, 1, -3 }, 1));
    System.out.println(QuadrupleSumToTarget.searchQuadruplets(new int[] { 2, 0, -1, 1, -2, 2 }, 2));
  }
}