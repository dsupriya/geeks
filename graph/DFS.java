class Traversal
{
    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> g, int n)
    {
       // add your code here
       Iterator itr = g.iterator();
       boolean visited[] = new boolean[n];
       ArrayList <Integer>sol = new <Integer>ArrayList();
       //System.out.println(g);
      
            for(int i=0;i<n;i++)
            {
                
                if(visited[i] == false)
                    DFS(g,visited,i,sol);
            }
            
        
        return sol;
       
       
    }
    public static void DFS(ArrayList<ArrayList<Integer>> g, boolean [] visited,int start,ArrayList <Integer>sol)

    {
        visited [start] = true;
        //System.out.print(start+" ");
        sol.add(start);
        ArrayList l1 = g.get(start);
        Iterator itr = l1.iterator();
        while(itr.hasNext())
        {
            int t = (Integer)itr.next();
            if(visited[t]==false)
                DFS(g,visited,t,sol);
        }
    }
}

