# Right View of a Binary Tree (easy
Given a binary tree, return an array containing nodes in its right view. The right view of a binary tree is the set of nodes visible when the tree is seen from the right side.


![alt text][logo]

[logo]:https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/07.%20Pattern%20Tree%20Breadth%20First%20Search/7.%20Connect%20Level%20Order%20Siblings%20(medium)/Example.PNG "example"

# Solution
This problem follows the Binary Tree Level Order Traversal pattern. We can follow the same BFS approach. The only additional thing we will be doing is to append the last node of each level to the result array.

# Time complexity
The time complexity of the above algorithm is O(N)O(N), where ‘N’ is the total number of nodes in the tree. This is due to the fact that we traverse each node once.

# Space complexity
The space complexity of the above algorithm will be O(N) as we need to return a list containing the level order traversal. We will also need O(N) space for the queue. Since we can have a maximum of N/2 nodes at any level (this could happen only at the lowest level), therefore we will need O(N) space to store them in the queue.

# Similar Questions
Problem 1: Given a binary tree, return an array containing nodes in its left view. The left view of a binary tree is the set of nodes visible when the tree is seen from the left side.

Solution: We will be following a similar approach, but instead of appending the last element of each level, we will be appending the first element of each level to the output array.