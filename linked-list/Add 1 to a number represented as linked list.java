// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.print(node.data); 
            node = node.next; 
        } 
        System.out.println(); 
    }
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();

            Node head = null;
            Node prev = head;
            while(n!=0)
            {
                int x = n%10;
                if(head == null){
                    head = new Node(x);
                    prev = head;
                }
                else
                {
                    prev = new Node(x);
                    prev.next = head;
                    head = prev;
                }
                n = n/10;
            }
            Solution ob = new Solution();
            head = ob.addOne(head);
            printList(head); 
            t--;
        }
    } 
} 
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution{
    public Node addOne(Node head) 
    { 
        // code here 
         head = reverseLinkedList(head);
         Node cur =head;
         int add = 1;
         while(cur!=null)
        {
            if(cur.data+1>=10 && cur.next==null)
            {
                cur.data = 0;
                Node new_node = new Node(1);
                cur.next = new_node;
                break;
                
            }
            if(cur.data+1>=10)
            {
                cur.data = 0;
                cur=cur.next;
            }
            else
            {
                cur.data=cur.data+1;
                break;
            }
        }
        head = reverseLinkedList(head);
         
        return head;
        
        
        
    } 
    public static Node reverseLinkedList(Node head)
    {
        Node temp,cur;
        Node prev =null;
        temp = cur = head;
        while(cur!=null)
        {
            temp = cur.next;
            cur.next =prev;
            prev =cur;
            cur =temp;
        }
        return prev;
    }
}

