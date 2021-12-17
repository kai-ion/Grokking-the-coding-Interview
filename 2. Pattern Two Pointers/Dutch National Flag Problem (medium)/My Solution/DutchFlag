class DutchFlag {

  public static void sort(int[] arr) {
    // TODO: Write your code here 
    int n = arr.length;
    int high = n - 1;
    int low = 0;

    int i = 0;
    while (i <= high) {
        if (arr[i] == 0) {
            swap(arr, i, low);
            low++;
            i++;
        }
        else if (arr[i] == 1) {
            i++;
        }
        else if (arr[i] == 2) {
            swap (arr, i, high);
            high--;
        }
    }
  }

  public static void swap(int[] arr, int i, int target) {
    int temp = arr[i];
    arr[i] = arr[target];
    arr[target] = temp;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 1, 0, 2, 1, 0 };
    DutchFlag.sort(arr);
    for (int num : arr)
      System.out.print(num + " ");
    System.out.println();

    arr = new int[] { 2, 2, 0, 1, 2, 0 };
    DutchFlag.sort(arr);
    for (int num : arr)
      System.out.print(num + " ");
  }
}