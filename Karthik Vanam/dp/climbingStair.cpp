int solve(int n,vector<int> &dp){
        if(n==0) return 1;
        if(dp[n] != -1) return dp[n];
        int j1=solve(n-1,dp);
        int j2=0;
        if(n-2>=0)
        j2=solve(n-2,dp);
        return dp[n]=j1+j2;
    }
int climbStairs(int n) {
    vector<int> dp(n+1,-1);
    return solve(n,dp);
    
}