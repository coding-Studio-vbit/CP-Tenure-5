class Solution {
public:
    bool solve(vector<int>& stones, int k, int pos, map<string,int> &dp) {
        if (pos == stones.size() - 1)
            return true;
        string key=to_string(pos)+to_string(k);
        if(dp.find(key) != dp.end()) return dp[key];
        for (int i = pos + 1; i < stones.size(); i++) {
            int diff = stones[i] - stones[pos];
            if (diff == k || diff == k - 1 || diff == k + 1) {
                if (solve(stones, diff, i,dp))
                    return dp[key] = true;
            }
        }

        return dp[key] = false;
    }
    bool canCross(vector<int>& stones) { 
        if(stones[1] != 1) return false;
        map<string,int> dp;
        return solve(stones, 1, 1,dp);
         }
};