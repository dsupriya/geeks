Add two numbers represented by linked lists 
Given two numbers represented by two linked lists of size N and M. The task is to return a sum list. The sum list is a linked list representation of the addition of two input numbers.

Input:
The first line of input contains the number of test cases T. For each test case, the first line of input contains the length of the first linked list and next line contains N elements of the linked list. Again, the next line contains M, and the following line contains M elements of the linked list.

Output:
Output the resultant linked list.

User Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the new list.
Note:
The linked list has been constructed in the reverse order of the number. That is if the number is given is 123 then the linked list representing it is 3 -> 2 -> 1.
Hence, the resultant number to be printed will be in reverse order(rightmost digit as head and followed by digits to its left).

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= T <= 100
1 <= N, M <= 100

Example:
Input:
2
2
4 5
3
3 4 5
2
6 3
1
7
Output:
0 9 3 
0 7

Explanation:
Testcase 1: For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked list will be (0 9 3).
Testcase 2: For the given two linked list (6 3) and (7), after adding the two linked list resultant linked list will be (0 7).
