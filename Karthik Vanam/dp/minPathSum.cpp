class Solution {
public:
    int solve(int i,int j, int m,int n,vector<vector<int>>& grid,vector<vector<int>> &dp){
        if(i==0 && j==0) return grid[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        int right = (j>0)?solve(i,j-1,m,n,grid,dp):INT_MAX;
        int down= (i>0)?solve(i-1,j,m,n,grid,dp):INT_MAX;
        return dp[i][j] = min(right,down)+grid[i][j];

    }
       
        
    int minPathSum(vector<vector<int>>& grid) {
        int m= grid.size();
        int n= grid[0].size();
        vector<vector<int>> dp(m,vector<int> (n,-1));
        return solve(m-1,n-1,m,n,grid,dp);
    }
};