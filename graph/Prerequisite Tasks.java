// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int numTasks = sc.nextInt();
		    int n = sc.nextInt();
		    int prerequisites[][] = new int[n][2];
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution T = new Solution();
			if(T.canFinish(numTasks,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean canFinish(int v, int[][] a)
    {
        // Your Code goes here
        //boolean visited[] = new boolean[v];
        LinkedList <Integer> q = new LinkedList<Integer>();
        int [] in = new int [v];
        ArrayList <ArrayList<Integer>> g = new ArrayList <ArrayList<Integer>>();
        int n = a.length;
        //int m = a[0].length;
        for(int i=0;i<v;i++)
        {
            ArrayList <Integer>node = new ArrayList<Integer>();
            g.add(node);
        }
        for(int i =0;i<n;i++)
        {
            int p = a[i][0];
            int c = a[i][1];
            in[c]++;
            g.get(p).add(c);
        }
        int total =0;
        boolean ans = false;
        //System.out.println(g);
        for(int i=0;i<v;i++)
        {
            if(in[i]==0)
                q.add(i);
        }
        while(q.size()!=0)
        {
            total++;
            int temp = q.remove(0);
            ArrayList <Integer>neigh = g.get(temp);
            Iterator itr = neigh.iterator();
            while(itr.hasNext())
            {
                int z = (int)itr.next();
                in[z]--;
                if(in[z]==0)
                    q.add(z);
            }
        }
        if(total==v)
            return true;
        else
            return false;
        
        
        
        
        
        
        
    }
    
}
