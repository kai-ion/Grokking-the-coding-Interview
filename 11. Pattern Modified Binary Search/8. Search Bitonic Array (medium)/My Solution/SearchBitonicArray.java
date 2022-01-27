class SearchBitonicArray {

  public static int search(int[] arr, int key) {
    // TODO: Write your code here
    int max_index = find_Max(arr);
    return -1;
  }

  public static int find_Max(int[] arr) {

    int start = 0;
    int end = arr.lenth - 1;

    while (start <- end) {
      int mid = start + (end - start)/2;

      if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return start;
  }

  public static int bindary_Search (int[] arr, int key, int start, int end) {

    while (start <= end) {

      int mid = start + (end - start)/2

      if (key == arr[mid]) {
        return mid;
      }

      if (arr[start] < arr[end]) {

        if (arr[mid] < key) {
          start = mid + 1;
        } else {
          end = mid;
        }
      }
    }

    return start;
  }

  public static void main(String[] args) {
    System.out.println(SearchBitonicArray.search(new int[] { 1, 3, 8, 4, 3 }, 4));
    System.out.println(SearchBitonicArray.search(new int[] { 3, 8, 3, 1 }, 8));
    System.out.println(SearchBitonicArray.search(new int[] { 1, 3, 8, 12 }, 12));
    System.out.println(SearchBitonicArray.search(new int[] { 10, 9, 8 }, 10));
  }
}