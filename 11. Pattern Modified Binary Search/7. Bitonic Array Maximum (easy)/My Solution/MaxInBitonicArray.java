class MaxInBitonicArray {

  public static int findMax(int[] arr) {
    // TODO: Write your code here
    int start = 0;
    int end = arr.length;

    while (start <= end) {
      int mid = start + (end - start)/2;

      if (arr[mid] < arr[mid+1]) {
        start = mid + 1;
      } else if (arr[mid] > arr[mid+1]) {
        end = mid;
      }

    }
    return arr[start];
  }

  public static void main(String[] args) {
    System.out.println(MaxInBitonicArray.findMax(new int[] { 1, 3, 8, 12, 4, 2 }));
    System.out.println(MaxInBitonicArray.findMax(new int[] { 3, 8, 3, 1 }));
    System.out.println(MaxInBitonicArray.findMax(new int[] { 1, 3, 8, 12 }));
    System.out.println(MaxInBitonicArray.findMax(new int[] { 10, 9, 8 }));
  }
}