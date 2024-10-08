class ReverseInt {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long rev = 0;
        int sign = 1;
        if(x < 0){
            sign = -1;
        }
        x = Math.abs(x);
        while(x > 0){
            int r = x%10;
            x/=10;
            rev*=10;
            rev += r;
            if((rev < min) || (rev > max)){
                return 0;
            }
        }
        return sign*(int)rev;
    }
}