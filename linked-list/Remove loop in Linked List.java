// { Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
}

class GFG
{
    public static Node newNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }
    
    public static void makeLoop(Node head, int x){
        if (x == 0)
            return;
        Node curr = head;
        Node last = head;

        int currentPosition = 1;
        while (currentPosition < x)
        {
            curr = curr.next;
            currentPosition++;
        }
        
        while (last.next != null)
            last = last.next;
        last.next = curr;
    }
    
    public static boolean detectLoop(Node head){
        Node hare = head.next;
        Node tortoise = head;
        while( hare != tortoise )
        {
            if(hare==null || hare.next==null) return false;
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return true;
    }
    
    public static int length(Node head){
        int ret=0;
        while(head!=null)
        {
            ret += 1;
            head = head.next;
        }
        return ret;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = newNode(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = newNode(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, pos);
            
            solver x = new solver();
            x.removeLoop(head);
            
            if( detectLoop(head) || length(head)!=n )
                System.out.println("0");
            else
                System.out.println("1");
        }
    }
}
// } Driver Code Ends


/*
class Node
{
    int data;
    Node next;
}
*/

class solver
{
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        Node slow,fast;
        slow=fast=head;
        boolean ans=false;
        while(slow!=null &&fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast= fast.next.next;
            if(slow==fast)
            {
                ans =true;
                break;
            }
        }
        if(ans==false)
            return;
        //size of the loop
        int size = 0;
        while(true)
        {
            size++;
            slow=slow.next;
            if(fast==slow)
                break;
            
        }
        Node start=head;
        Node prev=head;
        for(int i=0;i<size;i++)
        {
            prev = start;
            start =start.next;
        }
        //System.out.println(size+" "+start.data);
            
        slow=head;
        
        while(slow!=start)
        {
            slow =slow.next;
            prev = start;
            start = start.next;
        }
        prev.next = null;
        
    }
}
