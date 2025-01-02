# BFS

This project demonstrates the Breadth-First Search (BFS) algorithm to traverse a binary tree and search for a specific target value. Unlike traditional BFS that uses a queue, this implementation uses a level-by-level approach without an explicit queue.

The program will print the visited nodes during the BFS traversal and indicate whether the target value was found in the tree.

Features
BFS Traversal: The program uses a Breadth-First Search technique to traverse the tree level by level, but without using a queue.
Target Search: The program searches for a specific target value within the tree. If the target is found, it will stop and return true.
Visited Nodes: As the BFS algorithm traverses through the tree, it prints out the nodes that are visited, giving a clear trace of the BFS exploration.
Code Walkthrough
This implementation avoids using a queue by processing each level of the tree iteratively. The algorithm follows these steps:

Level Traversal: Start by adding the root node to the first level.
Process Each Level: For each level, visit all nodes and add their children to the next level.
Target Check: If a node matches the target value, return true (target found).
The main program creates a sample binary tree, specifies the target value, and calls the BFS function. It then outputs whether the target was found and the order of visited nodes.
