// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());

            String s[] = read.readLine().trim().split("\\s+");
            int p = 0;
            for (int i = 1; i <= edg; i++) {
                int u = Integer.parseInt(s[p++]);
                int v = Integer.parseInt(s[p++]);
                list.get(u).add(v);
            }

            int[] res = new TopologicalSort().topoSort(list, nov);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}
// } Driver Code Ends


/*Complete the function below*/

/*
ArrayList<ArrayList<>Integer>adj: to represent graph containing 'N' vertices
                                    and edges between them
N: represent number of vertices
*/
class TopologicalSort {
    static int[] topoSort(ArrayList<ArrayList<Integer>> g, int n) {
        // add your code here
        int [] ans = new int[n];
        LinkedList <Integer> node = new LinkedList<Integer>();
        int []in = new int[n];
        Iterator itr = g.iterator();
        while(itr.hasNext())
        {
            ArrayList <Integer> neigh = (ArrayList <Integer>)itr.next();
            Iterator it = neigh.iterator();
            while(it.hasNext())
            {
                int temp = (int)it.next();
                in[temp]++;
            }
            
        }
        LinkedList <Integer> q = new LinkedList <Integer>();
        for(int i=0;i<n;i++)
        {
            if(in[i]==0)
                q.add(i);
        }
        int count=0;
        int v=0;
        while(q.isEmpty()!=true)
        {
            int temp = q.remove(0);
            ans[count] = temp;
            count++;
            ArrayList <Integer> neigh = g.get(temp);
            Iterator it = neigh.iterator();
            while(it.hasNext())
            {
                v = (int)it.next();
                in[v]--;
                if(in[v]==0)
                    q.add(v);
            }
            
        }
        
       
        
        
        //System.out.println(in);
        return ans;
        
    }
}
