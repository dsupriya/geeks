class Solution {
    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node slow,fast,prev;
        slow=fast=prev=head;
        while(true)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(fast==null || fast.next == null)
                break;
        }
        prev.next = slow.next;
        return head;
        
    }
}Delete Middle of Linked List 
