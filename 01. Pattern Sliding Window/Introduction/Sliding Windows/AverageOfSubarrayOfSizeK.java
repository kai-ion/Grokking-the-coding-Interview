import java.util.Arrays;


/**
 * The efficient way to solve this problem would be to visualize each contiguous subarray as a sliding window of ‘5’ elements. 
 * This means that we will slide the window by one element when we move on to the next subarray. 
 * To reuse the sum from the previous subarray, we will subtract the element going out of the window and add the element now being included in the sliding window. 
 * This will save us from going through the whole subarray to find the sum and, as a result, the algorithm complexity will reduce to O(N)O(N).
 */

 
class AverageOfSubarrayOfSizeK {
  public static double[] findAverages(int K, int[] arr) {
    double[] result = new double[arr.length - K + 1];
    double windowSum = 0;
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      windowSum += arr[windowEnd]; // add the next element
      // slide the window, we don't need to slide if we've not hit the required window size of 'k'
      if (windowEnd >= K - 1) {
        result[windowStart] = windowSum / K; // calculate the average
        windowSum -= arr[windowStart]; // subtract the element going out
        windowStart++; // slide the window ahead
      }
    }

    return result;
  }

  public static void main(String[] args) {
    double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 });
    System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
  }
}