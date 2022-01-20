# Path with Maximum Sum (hard)
Find the path with the maximum sum in a given binary tree. Write a function that returns the maximum sum.

A path can be defined as a sequence of nodes between any two nodes and doesn’t necessarily pass through the root. The path must contain at least one node.

![alt text][logo]

[logo]:https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/08.%20Pattern%20Tree%20Depth%20First%20Search/7.%20Path%20with%20Maximum%20Sum%20(hard)/Example.PNG "example"

# Solution
This problem follows the Binary Tree Path Sum pattern and shares the algorithmic logic with Tree Diameter. We can follow the same DFS approach. The only difference will be to ignore the paths with negative sums. 
Since we need to find the overall maximum sum, we should ignore any path which has an overall negative sum.

# Time complexity
The time complexity of the above algorithm is O(N), where ‘N’ is the total number of nodes in the tree. This is due to the fact that we traverse each node once.

# Space complexity
The space complexity of the above algorithm will be O(N) in the worst case. This space will be used to store the recursion stack. The worst case will happen when the given tree is a linked list (i.e., every node has only one child).
