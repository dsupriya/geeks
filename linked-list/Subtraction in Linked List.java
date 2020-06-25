// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.subLinkedList(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* Structure of Linked list node

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

*/

class Solution
{
    static Node subLinkedList(Node l1, Node l2)
    {
        // code here
        l1 = removeZero(l1);
        l2 = removeZero(l2);
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        
        int first = valueOfList(l1);
        int second = valueOfList(l2);
        System.out.println(first+" "+second);
        Node big,small;
        int ans =0;
        if(first>second)
        {
            big=l1;
            small=l2;
            ans = first-second;
            
        }
        else if(second > first)
        {
            big=l2;
            small=l1;
            ans = second - first;
        }
        else
        {
            Node head1 = new Node(0);
            return head1;
        }
        int n=1;
        int d=0;
        int neg = ans;
        ans = Math.abs(ans);
        String s1 =""+ans;
        Node new_head,temp,link;
        new_head=temp=link=l1;
        
        for(int i=0;i<s1.length();i++)
        {
           String t= ""+s1.charAt(i);
           d= Integer.parseInt(t);
           temp = new Node(d);
           if(n==1)
           {
               n++;
               new_head = temp;
               link =temp;
           }
           else
           {
               link.next = temp;
               link =temp;
           }
        }
        if(neg<0)
            new_head.data = new_head.data*(-1);
        return new_head;
        
       
        /*Node new_head,link,temp;
        new_head=link=l1;
        int c,d;
        c=d=0;
        while(big!=null)
        {
            first =big.data;
            big = big.next;
            if(small==null)
                second = 0;
            else
                {
                    second = small.data;
                    small =small.next;
                }
            if(first - (second+c)>=0)
            {
                d = first - (second+c);
                c=0;
            }
            else
            {
                first =first+10;
                d = first - (second+c);
                c=1;
            }
            temp = new Node(d);
            if(n==1)
            {
                new_head=temp;
                link=temp;
                n++;
            }
            else
            {
                link.next = temp;
                link = temp;
            }
                
            
        }
        new_head = reverseList(new_head);
        new_head = removeZero(new_head);
        return new_head;*/
        
    }
    
    public static int valueOfList(Node head)
    {
       int m =1;
       int ans =0;
       while(head!=null)
       {
           int t = head.data;
           ans = ans+(m*t);
           m = m*10;
           head =head.next;
       }
       return ans;
    }
    public static Node removeZero(Node head)
    {
        Node cur,next;
        cur=head;
        while(cur.next!=null)
        {
            if(cur.data==0)
            {
                head = cur.next;
                cur = head;
            }
            else
            {
                break;
            }
        }
        return head;
        
    }
    public static Node reverseList(Node head)
    {
        Node temp,cur,prev;
        temp=cur=head;
        prev=null;
        while(cur!=null)
        {
            temp = cur.next;
            cur.next = prev;
            prev =cur;
            cur =temp;
        }
        return prev;
        
    }
}
