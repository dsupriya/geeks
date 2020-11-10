// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            System.out.println(ob.NumberOfRotations(array,n));
            t--;
        }
    } 
} // } Driver Code Ends


//User function Template for Java


class Solution 
{ 
    static int NumberOfRotations(int arr[], int n) 
    { 
       // code here 
       int start =0;
       int end = n-1;
       int mid = 0;
       int ans = 0;
       
       while(start<end)
        {
            if(start==end)
                return start;
            mid = (end+start)/2;
             if (mid < end && arr[mid+1] < arr[mid]) 
            return (mid + 1); 
  
   
        if (mid > start && arr[mid] < arr[mid - 1]) 
            return mid; 
            
            if(arr[start]>arr[mid])
                end = mid-1;
            else if(arr[mid]>arr[end])
                start = mid+1;
            else return start;
            
           
        }
        
        return ans;
    }
} 
