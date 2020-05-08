//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1/?track=amazon-linkedlists&batchId=192
class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
       Node temp = head ;
       //temp=head;
       int count =0;
        while(temp != null)
           { temp=temp.next;
              count++;}
              
        count = (count/2)+1;
        temp = head;
        for(int i=1;i<count;i++)
        {
            temp=temp.next;
        }
        return temp.data;
   }
}
