# Problem Statement#
Given a binary tree, populate an array to represent its level-by-level traversal. You should populate the values of all nodes of each level from left to right in separate sub-arrays.

![alt text][logo]

[logo]: https://github.com/kai-ion/Grokking-the-coding-Interview/blob/main/07.%20Pattern%20Tree%20Breadth%20First%20Search/1.%20Binary%20Tree%20Level%20Order%20Traversal%20(easy)/Example.PNG "example"

# Solution 
Since we need to traverse all nodes of each level before moving onto the next level, we can use the Breadth First Search (BFS) technique to solve this problem.

We can use a Queue to efficiently traverse in BFS fashion. Here are the steps of our algorithm:

Start by pushing the root node to the queue.
Keep iterating until the queue is empty.
In each iteration, first count the elements in the queue (let’s call it levelSize). We will have these many nodes in the current level.
Next, remove levelSize nodes from the queue and push their value in an array to represent the current level.
After removing each node from the queue, insert both of its children into the queue.
If the queue is not empty, repeat from step 3 for the next level.


# Time complexity
The time complexity of the above algorithm is O(N), where ‘N’ is the total number of nodes in the tree. This is due to the fact that we traverse each node once.

# Space complexity
The space complexity of the above algorithm will be O(N) as we need to return a list containing the level order traversal. We will also need O(N) space for the queue. Since we can have a maximum of N/2 nodes at any level (this could happen only at the lowest level), therefore we will need O(N) space to store them in the queue.