    int solve(int i,int j, int m,int n,vector<vector<int>> &dp){
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int right = (j<n-1)?solve(i,j+1,m,n,dp):0;
        int down= (i<m-1)?solve(i+1,j,m,n,dp):0;

        return dp[i][j]=right+down;

    }
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp(m,vector<int> (n,-1));
        return solve(0,0,m,n,dp);
    }