// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int n, int matrix[][])
    {
        // code here
        int [][]dp = new int [n][n];
        for(int i=0;i<n;i++)
        {
            dp[0][i] = matrix[0][i];
        }
        int u,l,r;
        for(int i=1;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
               u = dp[i-1][j];
               l = j-1>=0 ? dp[i-1][j-1] : 0;
               r = j+1<n ? dp[i-1][j+1] : 0;
               dp[i][j] = matrix[i][j] + Math.max(u, Math.max(l,r));
            }
        }
        int max = -1;
        for(int i=0;i<n;i++)
        {
            max = Math.max(dp[n-1][i],max);
        }
        return max;
    }
}
