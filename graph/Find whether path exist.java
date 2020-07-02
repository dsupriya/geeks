// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int A[][] = new int[n][n];
            String[] s = br.readLine().trim().split(" ", n * n);
            int k = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = Integer.parseInt(s[k]);
                    k++;
                }
            }

            Solution T = new Solution();
            System.out.println(T.is_possible(A, n));

            t--;
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    // M : input matrix
    // N : size of the matrix
    public static int is_possible(int a[][], int n) {
        // your code goes here
        int  ans= 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j] ==1)
                {
                    ans = findPath(a,n,i,j);
                    return ans;
                }
            }
        }
        return ans;
        
    }
    public static int findPath(int [][]a, int n, int t1,int t2)
    {
        boolean [][] visited = new boolean[n][n];
        LinkedList <Cell>q = new LinkedList<Cell>();
        int []neigh = new int[]{0,1,0,-1,1,0,-1,0};
        Cell start = new Cell(t1,t2);
        q.add(start);
        int row,col,c_row,c_col;
        row=col=c_row=c_col=0;
        
        while(q.isEmpty()!=true)
        {
            Cell temp = q.remove(0);
            c_row = temp.x;
            c_col = temp.y;
            for(int i=0;i<8;i=i+2)
            {
                row = c_row+neigh[i];
                col = c_col+neigh[i+1];
                if(row>=0 && col>=0 && row<n && col<n && a[row][col]!=0 && visited[row][col] ==false)
                {
                    if(a[row][col]==2)
                        return 1;
                    else
                    {
                        Cell t = new Cell(row,col);
                        visited[row][col] = true;
                        q.add(t);
                    }
                }
            }
            
        }
        return 0;
    }
}

class Cell
{
    Integer x,y;
    Cell(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
