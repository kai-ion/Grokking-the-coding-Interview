# Problem Statement
Given a binary tree and a number sequence, find if the sequence is present as a root-to-leaf path in the given tree.

![alt text][logo]

[logo]:https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/08.%20Pattern%20Tree%20Depth%20First%20Search/4.%20Path%20With%20Given%20Sequence%20(medium)/Example.PNG
"example"


# Solution
This problem follows the Binary Tree Path Sum pattern. We can follow the same DFS approach and additionally, track the element of the given sequence that we should match with the current node. Also, we can return false as soon as we find a mismatch between the sequence and the node value.

# Time complexity
The time complexity of the above algorithm is O(N), where ‘N’ is the total number of nodes in the tree. This is due to the fact that we traverse each node once.

# Space complexity
The space complexity of the above algorithm will be O(N) in the worst case. This space will be used to store the recursion stack. The worst case will happen when the given tree is a linked list (i.e., every node has only one child).
