class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp[][]= new int [n+1][w+1];
         for(int i=1;i<n+1;i++)
         {
            for(int j=1;j<w+1;j++)
            {
                if(j>=wt[i-1])
                {
                    dp[i][j] = Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
         }
         return dp[n][w];
    } 
}
