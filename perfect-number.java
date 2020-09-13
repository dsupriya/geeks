/*

A number is a perfect number if is equal to sum of its proper divisors, that is, sum of its positive divisors excluding the number itself. Write a function to check if a given number is perfect or not.
Examples:

Input: n = 15
Output: false
Divisors of 15 are 1, 3 and 5. Sum of 
divisors is 9 which is not equal to 15.

Input: n = 6
Output: true
Divisors of 6 are 1, 2 and 3. Sum of 
divisors is 6.
*/

public class MyClass {
    public static void main(String args[]) {
      

      System.out.println(isPerfect(6));
    }
    
    public static boolean isPerfect(int n)
    {
        int sum = 1;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i+(n/i);
            }
        }
        System.out.println(sum+" "+n);
        return sum==n;
    }
}
