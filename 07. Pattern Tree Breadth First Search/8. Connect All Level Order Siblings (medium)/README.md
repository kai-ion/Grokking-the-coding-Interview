# Connect All Level Order Siblings (medium)
Given a binary tree, connect each node with its level order successor. The last node of each level should point to the first node of the next level.

![alt text][logo]

[logo]:https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/07.%20Pattern%20Tree%20Breadth%20First%20Search/8.%20Connect%20All%20Level%20Order%20Siblings%20(medium)/Example.PNG "example"


# Solution
This problem follows the Binary Tree Level Order Traversal pattern. We can follow the same BFS approach. The only difference will be that while traversing we will remember (irrespective of the level) the previous node to connect it with the current node.

# Time complexity
The time complexity of the above algorithm is O(N), where ‘N’ is the total number of nodes in the tree. This is due to the fact that we traverse each node once.

# Space complexity
The space complexity of the above algorithm will be O(N) which is required for the queue. Since we can have a maximum of N/2N/2 nodes at any level (this could happen only at the lowest level), therefore we will need O(N) space to store them in the queue.

