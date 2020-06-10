class ReverseLL
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverseList(Node head)
   {
        // add code here
        Node cur,temp,prev;
        cur = temp =head;
        prev =null;
        while(temp != null)
        {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            
        }
        return prev;
   }
}
