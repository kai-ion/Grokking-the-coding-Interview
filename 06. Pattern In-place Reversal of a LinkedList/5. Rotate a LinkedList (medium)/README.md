# Rotate a LinkedList (medium)
Given the head of a Singly LinkedList and a number ‘k’, rotate the LinkedList to the right by ‘k’ nodes.

If, in the end, you are left with a sub-list with less than ‘k’ elements, reverse it too.

![alt text][logo]

[logo]: https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/06.%20Pattern%20In-place%20Reversal%20of%20a%20LinkedList/5.%20Rotate%20a%20LinkedList%20(medium)/Rotate%20a%20LinkedList%20(medium).PNG "Example"


# Solution
Another way of defining the rotation is to take the sub-list of ‘k’ ending nodes of the LinkedList and connect them to the beginning. Other than that we have to do three more things:

Connect the last node of the LinkedList to the head, because the list will have a different tail after the rotation.
The new head of the LinkedList will be the node at the beginning of the sublist.
The node right before the start of sub-list will be the new tail of the rotated LinkedList.

# Time complexity
The time complexity of our algorithm will be O(N) where ‘N’ is the total number of nodes in the LinkedList.

# Space complexity
We only used constant space, therefore, the space complexity of our algorithm is O(1).
