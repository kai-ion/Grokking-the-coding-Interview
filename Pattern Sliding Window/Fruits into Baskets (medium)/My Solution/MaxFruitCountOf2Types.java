import java.util.*;

class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
    // TODO: Write your code here
    int windowStart = 0;
    int windowEnd = 0;
    int n = arr.length;
    int windowLength = 0;
    int temp;
    int diffFruites = 2;
    int maxLength = 0;

    HashMap<Character, Integer> map = new HashMap<>();

    for (windowEnd = 0; windowEnd < n; windowEnd++) {
        if (map.containsKey(arr[windowEnd])) {
            temp = map.get(arr[windowEnd]);
            map.put(arr[windowEnd], temp + 1);
        }
        else if (!map.containsKey(arr[windowEnd])) {
            map.put(arr[windowEnd], 1);
        }
        
        while (map.size() > diffFruites) {
            temp = map.get(arr[windowStart]);
            map.put(arr[windowStart], temp - 1);

            if (map.get(arr[windowStart]) == 0) {
                map.remove(arr[windowStart]);
            }
            windowStart++;

        }

        windowLength = windowEnd - windowStart + 1;

        maxLength = Math.max(windowLength, maxLength);
    }

    return maxLength;
  }

  public static void main(String[] args) {
    System.out.println("Maximum number of fruits: " + 
                          MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
    System.out.println("Maximum number of fruits: " + 
                          MaxFruitCountOf2Types.findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
  }
}
