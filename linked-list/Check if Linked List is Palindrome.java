// { Driver Code Starts
import java.util.*;

class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Is_LinkedList_Palindrom
{
	 Node head;  
	 Node tail;
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Palindrome g = new Palindrome();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}



// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        //Your code here
        int count =0;
        Node cur = head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        int m = count/2;
        Node mid;
        mid = head;
        cur=head;
        for(int i=1;i<m;i++)
        {   
           
            cur=cur.next;
        }
        //System.out.print(cur.data+"   ");
        mid = cur.next;
        
        cur.next = null;
        mid =  reverse(mid);
        cur=head;
        boolean ans =true;
        while(cur!=null && mid!=null)
        {
            if(cur.data!=mid.data)
                return false;
            else
            {
                cur=cur.next;
                mid = mid.next;
            }
        }
        return ans;
        
        
         
    } 
    public static Node reverse(Node head)
    {
        Node prev,temp,cur;
        prev=null;
        cur=head;
        while(cur!=null)
        {
            temp = cur.next;
            cur.next =prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}

