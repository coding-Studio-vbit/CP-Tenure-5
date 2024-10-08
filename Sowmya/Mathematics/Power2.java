class Power2 {
    public boolean isPowerOfTwo(int n) {
        if(n>=1){
            if((n&(n-1))==0){
                return true;
            }
            return false;
        }
        return false;
    }
}