class KthFactor {
    public int kthFactor(int n, int k) {
        int[] factors = new int[n];
        int j = 0;
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                factors[j++] = i;
            }
        }
        if(factors[k-1]==0){
            return -1;
        }
        return factors[k-1];
    }
}