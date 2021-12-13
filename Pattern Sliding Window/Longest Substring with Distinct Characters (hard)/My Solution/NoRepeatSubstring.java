import java.util.*;

class NoRepeatSubstring {
  public static int findLength(String str) {
    // TODO: Write your code here
    int maxLength = 0, n = str.length();
    int windowStart = 0, windowEnd = 0, windowLength = 0;
    HashSet<Character> set = new HashSet<>();
    char ch;

    for (windowEnd = 0; windowEnd < n; windowEnd++) {
      ch = str.charAt(windowEnd);
      if (!set.add(ch)) {
        while (str.charAt(windowStart) != ch) {
          set.remove(str.charAt(windowStart));

          windowStart++;
        }
      }

      windowLength = set.size();
      maxLength = Math.max(windowLength, maxLength);


    }

    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
    System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde"));
  }
}