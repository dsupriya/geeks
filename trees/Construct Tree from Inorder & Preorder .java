Construct Tree from Inorder & Preorder 
Given 2 Arrays of Inorder and preorder traversal. Construct a tree and print the Postorder traversal. 

Input:
First-line consists of T test cases. The first line of every test case consists of N, denoting the number of elements in the array. The second and third line of every test case consists of Inorder and preorder traversal of a tree.

Output:
For each test case, print the postorder traversal in a new line.

User Task:
Your task is to complete the function buildTree() which takes 3 arguments(inorder traversal array, preorder traversal array, and size of tree n) and returns the root node to the tree constructed. You are not required to print anything and a new line is added automatically.

Expected Time Complexity: O(N*N).
Expected Auxiliary Space: O(N).

Constraints:
1<=T<=500
1<=N<=1000

Example:
Input:
2
4
1 6 8 7
1 6 7 8
6
3 1 4 0 5 2
0 1 3 4 2 5

Output:
8 7 6 1
3 4 1 5 2 0
