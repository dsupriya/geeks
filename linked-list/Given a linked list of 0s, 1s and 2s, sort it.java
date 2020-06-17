import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class LinkedList
{
    static Node segregate(Node head)
    {
        // add your code here
        
        Node cur = head;
        int zero,one,two;
        zero=one=two=0;
        while(cur!=null)
        {
            if(cur.data==0)
            {
                zero++;
            }
            else if(cur.data ==1)
            {
                one++;
            }
            else
                two++;
            cur=cur.next;
        }
        cur=head;
        for(int i=0;i<zero;i++)
        {
            cur.data =0;
            if(cur!=null)
                cur=cur.next;
        }
        for(int i=0;i<one;i++)
        {
            cur.data =1;
            if(cur!=null)
                cur=cur.next;
        }
        for(int i=0;i<two;i++)
        {
            cur.data =2;
            if(cur!=null)
                cur=cur.next;
        }
        return head;
        
        
    }
}


