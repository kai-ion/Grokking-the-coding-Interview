class BinarySearch {

  public static int search(int[] arr, int key) {
    // TODO: Write your code here
    int start = 0; 
    int end = arr.length - 1;
    boolean isAcend = arr[start] < arr[end];
    

    while (start <= end) {

      int mid = start + (end - start)/2;

      if (key == arr[mid]) {
        return mid;
      }

      if (isAcend) {
        if (key < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (key > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }


    }


    return -1;
  }

  public static void main(String[] args) {
    System.out.println(BinarySearch.search(new int[] { 4, 6, 10 }, 10));
    System.out.println(BinarySearch.search(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
    System.out.println(BinarySearch.search(new int[] { 10, 6, 4 }, 10));
    System.out.println(BinarySearch.search(new int[] { 10, 6, 4 }, 4));
  }
}