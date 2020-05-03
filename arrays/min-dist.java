// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
class MinDist {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            long x = Long.parseLong(xy[0]);
            long y = Long.parseLong(xy[1]);
            GfG g = new GfG();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}// } Driver Code Ends


// User function Template for Java

/*Complete the function below*/
class GfG {
    long minDist(long a[], long n, long x, long y) {
        // add code here.
        boolean  found= false;
        long ans = Integer.MAX_VALUE;
        int cur=0;
        int i=0;
        int x_pos,y_pos;
        x_pos=y_pos=-1;
        while(i<n)
        {
            if(a[i]==x)
            {
                x_pos=i;
            }
            if(a[i]==y)
            {
                y_pos=i;
            }
            if(x_pos!=-1 && y_pos!=-1)
            {
                cur = Math.abs(x_pos-y_pos);
                found =true;
                if(ans>cur)
                    ans=cur;
            }
            i++;
        }
        if(found == true)
            return ans;
        else 
        return -1;
    }
}
