import java.math.MathContext;
import java.util.*;

class ReplacingOnes {
  public static int findLength(int[] arr, int k) {
    // TODO: Write your code here
    int windowStart = 0, windowEnd, windowLength = 0;
    int n = arr.length, temp;
    int maxLength = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    int maxRepeat = 0;

    for (windowEnd = 0; windowEnd < n; windowEnd++) {
        map.put(arr[windowEnd], map.getOrDefault(arr[windowEnd], 0) + 1);
        maxRepeat = Math.max(map.get(arr[windowEnd]), maxRepeat);

        while (windowEnd - windowStart + 1 - maxRepeat > k) {
            temp = map.get(arr[windowStart]);
            map.put(arr[windowStart], temp - 1);

            windowStart++;
        }

        windowLength = windowEnd - windowStart + 1;
        maxLength = Math.max(windowLength, maxLength);

    }

    return maxLength;


  }

  public static void main(String[] args) {
    System.out.println(ReplacingOnes.findLength(new int[] { 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1 }, 2));
    System.out.println(ReplacingOnes.findLength(new int[] { 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1 }, 3));
  }
}
