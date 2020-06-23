// { Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;

    Node() {}
    Node(int d) {
        data = d;
        next = null;
    }
} class Add_LinkedList {
    Node head;

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        // System.out.println("");
    }

    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n1 = sc.nextInt();
            Add_LinkedList list1 = new Add_LinkedList();
            for (int i = 1; i <= n1; i++) {
                int a = sc.nextInt();
                list1.push(a);
            }
            int n2 = sc.nextInt();
            Add_LinkedList list2 = new Add_LinkedList();
            for (int i = 0; i < n2; i++) {
                int b = sc.nextInt();
                list2.push(b);
            }
            Add_LinkedList list3 = new Add_LinkedList();
            Add g = new Add();
            Node rs = g.addTwoLists(list1.head, list2.head);
            list3.printList(rs);
            System.out.println();
            T--;
        }
    }
}// } Driver Code Ends


/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/

class Add {
    
    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        // Your code here
        //System.out.println(first.data+" "+second.data);
        
        Node new_head = null;
        Node last = new_head;
        int c, d;
        d=c=0;
        int f,s;
        while(first!=null || second!=null)
        {
            if(first==null)
                f=0;
            else
                f=first.data;
            if(second == null)
                s=0;
            else
                s=second.data;
                
            
            if(new_head==null)
            {
               d = f+s;
               if(d>=10)
               {
                   c = d/10;
                   d = d%10;
                }
                else
                    c=0;
                new_head = new Node(d);
                last = new_head;
                
            }
            /*else if(first.data+second.data+c>=10 && (first.next ==null || second.next ==null)
            {
                
            }*/
            else
            {
                d = f+s+c;
                if(d>=10)
               {
                   c = d/10;
                   d = d%10;
                }
                else
                    c=0;
                Node next = new Node(d);
                last.next =next;
                last = next;
                
            }
            if(first!=null)
                first=first.next;
            if(second!=null)
                second=second.next;
        }
        /*if(second==null && first!=null)
        {
            first.data=first.data+c;
            last.next = first;
        }
        else if(first==null && second!=null)
        {
            second.data=second.data+c;
            last.next = second;
        }
        else*/ if( first==null && second==null && c!=0)
        {
            Node  carry = new Node(c);
            last.next =carry;
        }
       
        return new_head;
        
    }
}
