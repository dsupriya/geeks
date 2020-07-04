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
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Sol obj = new Sol();
            
            printList(obj.findUnion(head1, head2));
            System.out.println();
        }
    }
}// } Driver Code Ends


/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    HashSet <Integer> hs = new HashSet<Integer>();
	    Node cur = head1;
	    while(cur!=null)
	    {
	        int t = cur.data;
	        hs.add(t);
	        cur=cur.next;
	    }
	     cur = head2;
	    while(cur!=null)
	    {
	        int t = cur.data;
	        hs.add(t);
	        cur=cur.next;
	    }
	    Node new_head,link;
	    new_head=link=head1;
	    Iterator itr = hs.iterator();
	    int n=1;
	    while(itr.hasNext())
	    {
	        int t = (int)itr.next();
	        Node temp = new Node(t);
	        if(n==1)
	        {
	            n++;
	            new_head=temp;
	            link=temp;
	        }
	        else
	        {
	            link.next = temp;
	            link = temp;
	        }
	        
	    }
	    return new_head;
	}
}
