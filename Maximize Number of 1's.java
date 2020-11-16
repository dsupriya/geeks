// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
    int max = -1;
    int start,end;
    start=end=0;
    int count = 0;
    while(start <=end && end<n)
    {
        if(count<=m)
        {
            if(arr[end]==0)
                count++;
            end++;
        }
        else if(count > m)
        {
            if(arr[start]==0)
                count--;
            start++;;
        }
        if(count<=m)
            max = Math.max(max, end-start);
        
    }
    return max;
    
    
    
    }
}
