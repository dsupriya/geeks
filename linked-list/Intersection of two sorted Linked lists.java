// { Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node first , Node second)
    {
        // code here.
        int n=1;
        Node new_head,last;
        new_head=last=null;
        while(first!=null && second!=null)
        {
            if(first.data==second.data)
            {
                Node temp = new Node(first.data);
                if(n==1)
                {
                    n++;
                    new_head =temp;
                    last = temp;
                }
                else
                {
                    last.next = temp;
                    last = temp;
                }
                first = first.next;
                second = second.next;
            }
            else
            {
                if(first.data<second.data)
                    first = first.next;
                else
                    second = second.next;
            }
            
        }
        return new_head;
        
        
    }
}
