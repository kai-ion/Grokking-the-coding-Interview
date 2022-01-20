class NextLetter {

  public static char searchNextLetter(char[] letters, char key) {
    // TODO: Write your code here
    int len = letters.length;

    int start = 0;
    int end = len - 1;

    while ( start <= end) {
      int mid = start + (end - start)/2;

      if (key < letters[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    return letters[start % len];
  }

  public static void main(String[] args) {
    System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'f'));
    System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'b'));
    System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'm'));
    System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'h'));
  }
}