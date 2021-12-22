  
class ShortestWindowSort {

    public static int sort(int[] arr) {
      // TODO: Write your code here
      int n = arr.length;
      int p1 = -1, p2 = n;
      int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

      //find first misplaced number from left side, pointer 1
      for ( int i = 0; i < n; i++) {
        if (i > 0 && arr[i] < arr[i-1]) {
          p1 = i-1;
          break;
        }
      }

      //return 0 if p1 is -1, everything is sorted
      if ( p1 == -1) {
        return 0;
      }

      //find first misplaced number from right side, pointer 2
      for ( int i = n - 1; i >= 0; i--) {
        if ( i < (n - 1) && arr[i] > arr[i+1]) {
          p2 = i+1;
          break;
        }
      }

      //find min and max in the subarray obtained from p1 and p2
      for (int i = p1; i <= p2; i++) {
        max = Math.max(arr[i], max);
        min = Math.min(arr[i], max);
      }

      //extend the subarray by finding first num from left thats greater than min in subarray
      for ( int i = 0; i <= p1; i++) {
        if (arr[i] > min) {
          p1 = i;
          break;
        }
      }

      //extend the subarray by finding first num from right thats less than max in subarray
      for ( int i = n - 1; i >= p2; i--) {
        if (arr[i] < max) {
          p2 = i;
          break;
        }
      }

      return p2 - p1 + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(ShortestWindowSort.sort(new int[] { 1, 2, 5, 3, 7, 10, 9, 12 }));
        System.out.println(ShortestWindowSort.sort(new int[] { 1, 3, 2, 0, -1, 7, 10 }));
        System.out.println(ShortestWindowSort.sort(new int[] { 1, 2, 3 }));
        System.out.println(ShortestWindowSort.sort(new int[] { 3, 2, 1 }));
      }
  }
  