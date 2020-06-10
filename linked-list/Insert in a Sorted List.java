class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node cur = head;
        Node prev = head;
        Node new_node = new Node(key);
        if(head.data > key)
        {
            new_node.next = head;
            return new_node;
        }
        
        while(cur != null && cur.data <= key  )
        {
            prev = cur;
            cur = cur.next;
            
        }
        prev.next = new_node;
        new_node.next = cur;
        return head;
        
        
        
        
    }
}
