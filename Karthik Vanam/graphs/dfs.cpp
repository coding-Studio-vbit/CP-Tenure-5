void dfs(int node,vector<int> adj[],vector<int> &vis,vector<int> &ans){
        vis[node]=1;
        ans.push_back(node);
        for(auto &frnd:adj[node])
            if(!vis[frnd])
                dfs(frnd,adj,vis,ans);
    }
vector<int> dfsOfGraph(int V, vector<int> adj[]) {
        vector<int> ans;
        vector<int> vis(V,0);
        dfs(0,adj,vis,ans);
        return ans;
}