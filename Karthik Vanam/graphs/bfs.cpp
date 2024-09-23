    vector<int> bfsOfGraph(int V, vector<int> adj[]) {
      vector<int> vis(V,0);
       vector<int> ans;
       queue<int> q;
       vis[0]=1;
       q.push(0);
       
       while(!q.empty()){
           int node = q.front();
           ans.push_back(node);
           q.pop();
           for(auto frnd:adj[node])
                if(!vis[frnd]){
                    vis[frnd]=1;
                    q.push(frnd);
                }
       }
       
       return ans;
}