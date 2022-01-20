class DuplicateNumber {

  public static int findDuplicate(int[] arr) {
    int slow = 0, fast = 0;
    do {
      slow = arr[slow];
      fast = arr[arr[fast]];
    } while (slow != fast);

    // find cycle length
    int current = arr[slow];
    int cycleLength = 0;
    do {
      current = arr[current];
      cycleLength++;
    } while (current != arr[slow]);

    return findStart(arr, cycleLength);
  }

  private static int findStart(int[] arr, int cycleLength) {
    int pointer1 = arr[0], pointer2 = arr[0];
    // move pointer2 ahead 'cycleLength' steps
    while (cycleLength > 0) {
      pointer2 = arr[pointer2];
      cycleLength--;
    }

    // increment both pointers until they meet at the start of the cycle
    while (pointer1 != pointer2) {
      pointer1 = arr[pointer1];
      pointer2 = arr[pointer2];
    }

    return pointer1;
  }

  public static void main(String[] args) {
    System.out.println(DuplicateNumber.findDuplicate(new int[] { 1, 4, 4, 3, 2 }));
    System.out.println(DuplicateNumber.findDuplicate(new int[] { 2, 1, 3, 3, 5, 4 }));
    System.out.println(DuplicateNumber.findDuplicate(new int[] { 2, 4, 1, 4, 4 }));
  }
}