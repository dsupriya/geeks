// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg = sc.nextInt();
            for(int i = 0; i < nov+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if(new DetectCycle().isCyclic(list, nov) == true)
                System.out.println("1");
            else System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

/*
ArrayList<ArrayList<Integer>> adj: to represent graph containing 'v'
                                    vertices and edges between them
V: represent number of vertices
*/
class DetectCycle
{
    static boolean isCyclic(ArrayList<ArrayList<Integer>> g, int v)
    {
        // add your code here
        LinkedList <Integer>q = new LinkedList <Integer>();
        int indegree[] = new int[v];
        int visited =0;
        
        for(int i=0;i<v;i++)
        {
            ArrayList <Integer>neigh = g.get(i);
            Iterator itr = neigh.iterator();
            while(itr.hasNext())
            {
                int t = (int)itr.next();
                indegree[t]++;
                
            }

        }
        //System.out.println(g);
        for(int i=0;i<v;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        //System.out.println(q);
        while(q.size()!=0)
        {
            int temp = q.remove(0);
            visited++;
            ArrayList <Integer>neigh = g.get(temp);
            Iterator itr = neigh.iterator();
            while(itr.hasNext())
            {
                int n = (int)itr.next();
                indegree[n]--;
                
                if(indegree[n]==0)
                {
                    q.add(n);
                }
                
            }
            
        }
        //System.out.println(visited+" "+v);
        if(visited != v)
            return true;
        else    
            return false;
        
        
     }
}
