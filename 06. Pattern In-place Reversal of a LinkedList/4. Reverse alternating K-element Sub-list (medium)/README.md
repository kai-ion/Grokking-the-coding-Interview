# Reverse alternating K-element Sub-list (medium)
Given the head of a LinkedList and a number ‘k’, reverse every alternating ‘k’ sized sub-list starting from the head.

If, in the end, you are left with a sub-list with less than ‘k’ elements, reverse it too.

![alt text][logo]

[logo]: https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/06.%20Pattern%20In-place%20Reversal%20of%20a%20LinkedList/4.%20Reverse%20alternating%20K-element%20Sub-list%20(medium)/Reverse%20alternating%20K-element%20Sub-list%20(medium).PNG "Example"


# Solution
The problem follows the In-place Reversal of a LinkedList pattern and is quite similar to Reverse every K-element Sub-list. The only difference is that we have to skip ‘k’ alternating elements. We can follow a similar approach, and in each iteration after reversing ‘k’ elements, we will skip the next ‘k’ elements.


# Time complexity
The time complexity of our algorithm will be O(N) where ‘N’ is the total number of nodes in the LinkedList.

# Space complexity#
We only used constant space, therefore, the space complexity of our algorithm is O(1).
