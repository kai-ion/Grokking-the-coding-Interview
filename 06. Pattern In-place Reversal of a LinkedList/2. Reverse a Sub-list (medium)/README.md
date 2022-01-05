# Problem Statement
Given the head of a LinkedList and two positions ‘p’ and ‘q’, reverse the LinkedList from position ‘p’ to ‘q’.

![alt text][logo]

[logo]: https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/06.%20Pattern%20In-place%20Reversal%20of%20a%20LinkedList/2.%20Reverse%20a%20Sub-list%20(medium)/Reverse%20a%20Sub-list%20(medium).PNG "Example"

# Solution
The problem follows the In-place Reversal of a LinkedList pattern. We can use a similar approach as discussed in Reverse a LinkedList. Here are the steps we need to follow:

1. Skip the first p-1 nodes, to reach the node at position p.
2. Remember the node at position p-1 to be used later to connect with the reversed sub-list.
3. Next, reverse the nodes from p to q using the same approach discussed in Reverse a LinkedList.
4. Connect the p-1 and q+1 nodes to the reversed sub-list.

# Time complexity
The time complexity of our algorithm will be O(N) where ‘N’ is the total number of nodes in the LinkedList.

# Space complexity
We only used constant space, therefore, the space complexity of our algorithm is O(1).

# Similar Questions
### Problem 1: Reverse the first ‘k’ elements of a given LinkedList.

#### Solution: This problem can be easily converted to our parent problem; to reverse the first ‘k’ nodes of the list, we need to pass p=1 and q=k.

### Problem 2: Given a LinkedList with ‘n’ nodes, reverse it based on its size in the following way:

1. If ‘n’ is even, reverse the list in a group of n/2 nodes.
2. If n is odd, keep the middle node as it is, reverse the first ‘n/2’ nodes and reverse the last ‘n/2’ nodes.

#### Solution: When ‘n’ is even we can perform the following steps:

1. Reverse first ‘n/2’ nodes: head = reverse(head, 1, n/2)
2. Reverse last ‘n/2’ nodes: head = reverse(head, n/2 + 1, n)

When ‘n’ is odd, our algorithm will look like:

1. head = reverse(head, 1, n/2)
2. head = reverse(head, n/2 + 2, n)
