Problem Statement#
Given a string, find the length of the longest substring, which has all distinct characters.

Example 1:

Input: String="aabccbb"
Output: 3
Explanation: The longest substring with distinct characters is "abc".


Example 2:

Input: String="abbbb"
Output: 2
Explanation: The longest substring with distinct characters is "ab".


Example 3:

Input: String="abccde"
Output: 3
Explanation: Longest substrings with distinct characters are "abc" & "cde".

Solution#
This problem follows the Sliding Window pattern, 
and we can use a similar dynamic sliding window strategy as discussed in Longest Substring with K Distinct Characters. 
We can use a HashMap to remember the last index of each character we have processed. 
Whenever we get a duplicate character, we will shrink our sliding window to ensure that we always have distinct characters in the sliding window.


Time Complexity#
The above algorithm’s time complexity will be O(N)O(N), where ‘N’ is the number of characters in the input string.

Space Complexity#
The algorithm’s space complexity will be O(K)O(K), 
where KK is the number of distinct characters in the input string. T
his also means K<=NK<=N, because in the worst case, 
the whole string might not have any duplicate character, s
o the entire string will be added to the HashMap. Having said that, since we can expect a fixed set of characters in the input string (e.g., 26 for English letters), 
we can say that the algorithm runs in fixed space O(1)O(1); in this case, we can use a fixed-size array instead of the HashMap.