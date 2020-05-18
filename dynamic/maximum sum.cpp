// vec : given vector of elements
int maxSubArray(vector<int> vec) {
    // code here  
    
    int n = vec.size();
    
    int dp[n] ={0};
    dp[0]=vec.at(0);
    int curr = 0;
    int max= -100000;
    
    
    for(int i=0;i<n;i++)
    {
       curr = curr+vec.at(i);
       if(max<curr)
            max= curr;
        if(curr<0)
            curr=0;
    }
    return max;
    
}
