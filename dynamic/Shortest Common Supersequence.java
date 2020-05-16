/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
	    {
	        t--;
	        String s1= sc.next();
	        String s2=sc.next();
	        int ans = shortestCommonSupersequence(s1,s2);
	        System.out.println(ans);
	    }
	}
	public static int shortestCommonSupersequence(String s1, String s2)
	{
	    int n= s1.length();
	    int m = s2.length();
	    int [][]dp=new int[n+1][m+1];
	    for(int i=1;i<n+1;i++)
	    {
	        for(int j=1;j<m+1;j++)
	        {
	            if(s1.charAt(i-1)==s2.charAt(j-1))
	            {
	                dp[i][j]=1+dp[i-1][j-1];
	            }
	            else
	            {
	                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	    }
	    int temp=dp[n][m];
	    int ans= temp+(m-temp)+(n-temp);
	    return ans;
	    
	    
	 }
}
