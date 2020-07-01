// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            ArrayList<ArrayList<Integer>> list = new ArrayList<>(N);

            // creating arraylist of arraylist
            for (int i = 0; i < N; i++) {
                ArrayList<Integer> temp = new ArrayList<>(M);
                list.add(i, temp);
            }

            // adding elements to the arraylist of arraylist
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int val = sc.nextInt();
                    list.get(i).add(j, val);
                }
            }

            System.out.println(new Islands().findIslands(list, N, M));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Islands {

    // Function to find the number of island in the given list A
    // N, M: size of list row and column respectively
    static int findIslands(ArrayList<ArrayList<Integer>> a, int n, int m) {

        // Your code here
        boolean [][] visited = new boolean [n][m];
        int ans =0;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(visited[i][j]==false && a.get(i).get(j)==1)
                {
                    
                    getIslandCount(a,visited,n,m,i,j);
                    ans++;
                }
            }
        }
        return ans;
        
    }
    public static void getIslandCount(ArrayList<ArrayList<Integer>> a, boolean [][]visited,
    int n, int m, int i, int j)
    {
        LinkedList <Cell>q = new LinkedList<Cell>();
        Cell start = new Cell(i,j);
        visited[i][j]= true;
        q.add(start);
        int [] neigh = new int[]{0,1,0,-1,1,0,-1,0,1,1,-1,1,1,-1,-1,-1};
        int t1,t2;
        while(q.isEmpty()!=true)
        {
            Cell temp = q.remove(0);
            int row = temp.x;
            int col = temp.y;
            for(int k=0;k<neigh.length;k=k+2)
            {
                t1 = neigh[k];
                t2 = neigh[k+1];
                t1 = row+t1;
                t2 = col+t2;
                if(t1>=0 && t2 >=0 && t1<n && t2<m  && visited[t1][t2]==false &&
                a.get(t1).get(t2) ==1)
                {
                    Cell z = new Cell (t1,t2);
                    q.add(z);
                    visited[t1][t2] = true;
                }
            }
        }
    }
}

class Cell
{
    Integer x,y;
    Cell(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}
