class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
        int a = count(headA);
        int b = count(headB);
        Node big,small;
        if(a>b)
        {
            big = headA;
            small = headB;
        }
        else
        {
             big = headB;
            small = headA;
        }
        int d = Math.abs(a-b);
        for(int i=0;i<d;i++)
        {
            big=big.next;
        }
        int ans =0;
        while(small!=null && big!=null)
        {
            if(small == big)
            {
                ans=small.data;
                break;
            }
            small = small.next;
            big = big.next;
        }
        return ans;
	}
	public static int count(Node head)
	{
	    int ans =0;
	    while(head!=null)
	    {
	        ans++;
	        head = head.next;
	    }
	    return ans;
	}
}
