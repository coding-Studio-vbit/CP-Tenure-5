void dfs(int row,int col,vector<vector<char>>& grid,vector<vector<int>> &vis,int &m,int &n){
        vis[row][col]=1;

        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};

        for(int i=0;i<4;i++){
            int newrow=row+delrow[i];
            int newcol=col+delcol[i];
            if(newrow>=0 && newrow <m && newcol>=0 && newcol<n)
                if(!vis[newrow][newcol])
                    if(grid[newrow][newcol]=='1')
                        dfs(newrow,newcol,grid,vis,m,n);
        }
    }
    int numIslands(vector<vector<char>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        vector<vector<int>> vis(m,vector<int>(n,0));

        int count=0;
        for(int row=0;row<m;row++)
            for(int col=0;col<n;col++)
                if(!vis[row][col] && grid[row][col]=='1'){
                    count++;
                    dfs(row,col,grid,vis,m,n);
                }
        
        for(int row=0;row<m;row++)
            for(int col=0;col<n;col++)
                if(!vis[row][col] && grid[row][col]=='1')
                    return -1;
        return count;

    }