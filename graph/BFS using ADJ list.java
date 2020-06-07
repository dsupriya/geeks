/ User function Template for Java

/*
*  g[]: adj list of the graph
*  N : number of vertices
*/
class Traversal {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> g, int n) {
        // add your code here
        LinkedList <Integer>q = new LinkedList<Integer>();
        ArrayList<Integer> sol = new ArrayList<Integer>();
        ArrayList<Integer> neighbours;
        boolean []visited = new boolean[n];
        q.add(0);
        visited[0] = true;
        int s;
        /*while(q.isEmpty() == false)
        {
            int temp = q.remove(0);
            
            sol.add(temp);
            neighbours = (ArrayList<Integer>)g.get(temp);
            Iterator itr = neighbours.iterator();
            while(itr.hasNext() )
            {
                t = (int)itr.next();
                if(visited[t] ==false)
                { 
                    
                    q.add(t);
                    visited[t] = true;
                }
            }
        }*/
         while (q.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = (int)q.poll();
            sol.add(s);
           
  
          
            
            Iterator<Integer> i =g.get(s).listIterator(); 
            while (i.hasNext()) 
            { 
                int t = c; 
                if (!visited[t]) 
                { 
                    visited[t] = true; 
                    q.add(t); 
                } 
            } 
        }
        return sol;
        
        
         
    }
}
