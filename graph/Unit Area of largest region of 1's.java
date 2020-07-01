// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driverclass {
    static int SIZE = 100;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int g[][] = new int[SIZE][SIZE];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) g[i][j] = sc.nextInt();
            }

            System.out.println(new Area().findMaxArea(n, m, g));
        }
    }
}// } Driver Code Ends


// User function Template for Java

/*
*   SIZE: declared globally for matrix definition
*   N, M: row and column of matrix
*   A[][]: 2D matrix from input
*/
class Area {
    static int findMaxArea(int n, int m, int a[][]) {
      boolean [][] visited = new boolean [n][m];
        int ans =0;
        int max =-1;
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(visited[i][j]==false && a[i][j]==1)
                {

                    ans = getMaxArea(a,visited,n,m,i,j);
                    if(max<ans)
                        max = ans;
                }
            }
        }
        return max;

    }
    public static int getMaxArea(int [][] a, boolean [][]visited,
    int n, int m, int i, int j)
    {
        int size =0;
        LinkedList <Cell>q = new LinkedList<Cell>();
        Cell start = new Cell(i,j);
        visited[i][j]= true;
        q.add(start);
        //size++;
        int [] neigh = new int[]{0,1,0,-1,1,0,-1,0,1,1,-1,1,1,-1,-1,-1};
        int t1,t2;
        while(q.isEmpty()!=true)
        {
            size++;
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
                a[t1][t2] ==1)
                {
                    Cell z = new Cell (t1,t2);
                    q.add(z);
                    visited[t1][t2] = true;
                }
            }
        }
        return size;
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
