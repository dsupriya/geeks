import java.util.*;
public class Runner
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int k = sc.nextInt();
        String output = largestLexoString(input,k);
        System.out.println(output);
    }
    public static String largestLexoString(String input,int k)
    {
        //count
        StringBuffer ans = new StringBuffer();
        int []count = new int[26];
        int n = input.length();
        int j =0;
        for(char c : input.toCharArray())
        {
            count[c-'a']++;
        }
        for(int i=25;i>=0;)
        {
            if(count[i]>k)
            {
                j = 0;
                while(j<k)
                {
                    char next = (char)(i+'a');
                    ans = ans.append(next);
                    count[i]--;
                    j++;
                    
                }
                j=i-1;
                while(j>=0 && count[j]==0)
                    j--;
                if(j>=0 && count[j]>0)
                {
                    char next = (char)(j+'a');
                    ans = ans.append(next);
                    count[j]--;
                   
                }
                else
                    break;
            }
            else if(count[i]>0)
            {
                j = 0;
                while(j<k && count[i]>0)
                {
                    char next = (char)(i+'a');
                    ans = ans.append(next);
                    count[i]--;
                    j++;
                    
                }
                
            }
            else i--;
        }
        return new String(ans);
    }
}
