# Problem Statement
Given a binary tree, populate an array to represent the averages of all of its levels.

# Solution
This problem follows the Binary Tree Level Order Traversal pattern. We can follow the same BFS approach. The only difference will be that instead of keeping track of all nodes of a level, we will only track the running sum of the values of all nodes in each level. 
In the end, we will append the average of the current level to the result array.

# Time complexity
The time complexity of the above algorithm is O(N), where ‘N’ is the total number of nodes in the tree. This is due to the fact that we traverse each node once.

# Space complexity
The space complexity of the above algorithm will be O(N) which is required for the queue. Since we can have a maximum of N/2N/2 nodes at any level (this could happen only at the lowest level), therefore we will need O(N) space to store them in the queue.

# Similar Problems
Problem 1: Find the largest value on each level of a binary tree.

Solution: We will follow a similar approach, but instead of having a running sum we will track the maximum value of each level.

```
maxValue = max(maxValue, currentNode.val)
```