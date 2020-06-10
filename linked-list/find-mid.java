//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1/?track=amazon-linkedlists&batchId=192
class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node slow,fast;
         slow=fast=head;
         while(true)
        {
            slow = slow.next;
            fast = (fast.next).next;
            if(fast == null || fast.next == null)
                break;
        }
        return slow.data;
    }
}
