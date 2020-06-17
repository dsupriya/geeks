import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head = null;
            Node tail = null;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if(i==0)
                {
                    head = new Node(a);
                    tail = head;
                }
                else{
                    tail.next = new Node(a);
                    tail = tail.next;
                }
            }
            int k = sc.nextInt();
            Rotate g = new Rotate();
            head = g.rotate(head,k); // rotate linked list anti-clockwise by k nodes
            printList(head);
        }
    }
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}*/
class Rotate {
    
     public Node rotate(Node head, int k) {
         /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        // add code here.
        Node new_head,cur,prev;
        cur = head;
        prev = head;
        new_head = head;
        int count = 0;
        int length=0;
        while(cur!=null)
            {
                cur=cur.next;
                length++;
            }
        //System.out.println(length);
        if(k==length)
            return head;
        
        k = k%length;
        cur = head;
        while(cur.next != null)
        {
            count++;
            if(count == k)
            {
                prev =cur;
                
                
            }
           
            cur=cur.next;
        }
        
        cur.next = head;
        new_head = prev.next;
        prev.next = null;
        
        return new_head;
        
       
        
    }
}
