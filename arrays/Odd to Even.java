/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n>0)
	    {
	        n--;
	        String s = sc.next();
	        String ans = solve(s);
	        System.out.println(ans);
	    }
	
	}
	public static String solve(String s)
	{
	    int n = s.length();
	    int last_even = -1;
	    int big_even = -1;
	    int odd = -1;
	    int last = s.charAt(n-1)-'0';
	    for(int i=0;i<n-1;i++)
	    {
	        int temp = s.charAt(i)-'0';
	        if(temp%2==0)
	        {
	           last_even = i;
	           if(temp<last)
	               {
	                   big_even = i;
	                   break;
	               }
	           
	            
	        }
	        
	    }
	    String ans = new String();
	    if(big_even!=-1)
	    {
	        ans = stringSwap(s,big_even,n-1);
	    }
	    else if(last_even!=-1)
	    {
	        ans = stringSwap(s,last_even,n-1);
	    }
	    else
	        ans = s;
	   return ans;
	    
	}
	public static String stringSwap(String s, int i, int j)
	{
	    char [] c = s.toCharArray();
	    char temp = c[i];
	    c[i] = c[j];
	    c[j] = temp;
	    return new String(c);
	}
}
