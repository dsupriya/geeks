//User function Template for Java

/*
*ArrayList<ArrayList<Integer>> g: arraylist of arraylist which represents graph
*n: represents number of vertex in graph
*/
class MotherVertex
{
    static int findMother(ArrayList<ArrayList<Integer>> g, int n)
    {
        // add your code here
        boolean []visited = new boolean[n];
        Stack <Integer>s = new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
            {
                DFS(g,visited,s,n,i);
                
            }
        }
        
        int mother = s.pop();
        visited =  new boolean[n];
        DFS(g,visited,s,n,mother);
        boolean ans = isMother(visited);
        if(ans==true)
            return mother;
        
        
        return -1;
    }
    
    public static void DFS(ArrayList<ArrayList<Integer>> g,boolean []visited,Stack <Integer>s, int n,int v)
    {
        visited[v] =true;
        ArrayList <Integer>list = (ArrayList<Integer>)g.get(v);
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            int t =(int)itr.next();
            if(visited[t]==false)
                DFS(g,visited,s,n,t);
        }
        
        s.push(v);
        
    }
    
    public static boolean isMother(boolean []visited)
    {
        int n = visited.length;
        for(int i=0;i<n;i++)
        {
            if(visited[i]==false)
                return false;
        }
        return true;
    }
    
}

