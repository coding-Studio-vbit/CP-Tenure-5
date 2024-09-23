    void dfs(int row,int col,vector<vector<int>>& image,vector<vector<int>> &vis,int &m,int &n,vector<vector<int>> &ans,int color,int colorToChange){
        vis[row][col]=1;
        ans[row][col] = color;

        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};

        for(int i=0;i<4;i++){
            int newrow=row+delrow[i];
            int newcol=col+delcol[i];
            if(newrow>=0 && newrow <m && newcol>=0 && newcol<n)
                if(!vis[newrow][newcol])
                    if(image[newrow][newcol]==colorToChange)
                        dfs(newrow,newcol,image,vis,m,n,ans,color,colorToChange);
        }
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int m=image.size();
        int n=image[0].size();
        vector<vector<int>> vis(m,vector<int>(n,0));
        vector<vector<int>> ans=image;
        int colorToChange=image[sr][sc];
        dfs(sr,sc,image,vis,m,n,ans,color,colorToChange);

        return ans;

    }