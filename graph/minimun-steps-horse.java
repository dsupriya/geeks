// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble() { return Double.parseDouble(next()); }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

class GFG {
    public static void main(String[] args) {

        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ;
            int knightpos[] = new int[2];
            knightpos[0] = sc.nextInt();
            ;
            knightpos[1] = sc.nextInt();
            ;
            int targetpos[] = new int[2];
            targetpos[0] = sc.nextInt();
            ;
            targetpos[1] = sc.nextInt();

            Solution T = new Solution();
            System.out.println(T.minStepToReachTarget(knightpos, targetpos, n));
            t--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // KnightPos : knight position coordinates
    // targetPos : target position coordinated
    // N : square matrix size
    public int minStepToReachTarget(int k[], int t[], int n) {
        // Write your code here
       
        int path = BFS(n,k[0]-1,k[1]-1,t[0]-1,t[1]-1);
        
         return path;
    }
    public static int  BFS(int n, int c_r, int c_c, int t_r, int t_c)
    {
        boolean [][] visited = new boolean [n][n];
        int [][] distance = new int [n][n];
        Cell [][] parent = new Cell[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                distance[i][j] = 10000;
                parent[i][i] = new Cell();
                
            }
        }
        distance[c_r][c_c] = 0;
        visited[c_r][c_c]= true;
        LinkedList <Cell> q = new LinkedList <Cell>();
        Cell start = new Cell(c_r,c_c);
        q.add(start);
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 }; 
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 }; 
        int row,col;
        
        while(q.isEmpty()!= true)
        {
            Cell temp = q.remove(0);
            c_r = temp.x;
            c_c = temp.y;
            //System.out.println(c_r+" "+c_c);
            if(c_r==t_r && c_c ==t_c)
                return distance[c_r][c_c];
                        
                    
            for(int i=0;i<8;i++)
            {
                row = c_r+dx[i];
                col = c_c+dy[i];
                if(row>=0 && col>=0 && row<n && col<n && visited[row][col]==false)
                {
                    visited[row][col] = true;
                    distance[row][col] = 1+distance[c_r][c_c];
                    parent [row][col] = temp;
                    Cell new_add = new Cell(row,col);
                    q.add(new_add);
                    
                    
                        
                }
            }
            
        }
        return -1;
        
    }
}
class Cell
{
    int x,y;
    Cell(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    Cell()
    {
        this.x=-1;
        this.y=-1;
    }
}
