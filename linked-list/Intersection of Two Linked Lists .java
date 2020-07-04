// { Driver Code Starts
//

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
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* structure of list Node:

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

*/

class Sol
{
    public static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        // return the head of intersection list
        java.util.LinkedHashSet <Integer>hs = new java.util.LinkedHashSet<Integer>();
        Node cur = head2;
        int t =0;
        while(cur!=null)
        {
            t = cur.data;
            hs.add(t);
            cur = cur.next;
        }
        cur = head1;
        int n=0;
        Node new_head, link;
        new_head=link=head1;
        while(cur!=null)
        {
            t = cur.data;
            cur = cur.next;
            if(hs.contains(t)==true)
            {
                Node temp = new Node(t);
                if(n==0)
                {
                    n++;
                    new_head = temp;
                    link =temp;
                }
                else
                {
                    link.next = temp;
                    link = temp;
                }
            }
        }
        return new_head;
    }
}
