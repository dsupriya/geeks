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
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            
            Solution g = new Solution();
            printList(g.zigZag(head));
        }
    } 
}
// } Driver Code Ends


/*Node is as follows:

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
	public static Node zigZag(Node head){
        //add code here.
        Node cur;
        int n =1;
        int t=0;
        cur = head;
        while(cur!=null&&cur.next!=null)
        {
            if(n==1)
            {
                if(cur.data > cur.next.data)
                {
                    t = cur.data;
                    cur.data = cur.next.data;
                    cur.next.data = t;
                }
                n=0;
                cur=cur.next;
            }
            else if(n==0)
            {
                if(cur.data < cur.next.data)
                {
                    t = cur.data;
                    cur.data = cur.next.data;
                    cur.next.data = t;
                }
                n=1;
                cur=cur.next;
            }
        }
        return head;
    }
}
