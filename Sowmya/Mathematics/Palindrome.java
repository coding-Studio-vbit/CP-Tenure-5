class Palindrome {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n = x;
        while(n>0){
            rev *= 10;
            rev += n%10;
            n /= 10;
        }
        if(rev == x){
            return true;
        }
        return false;
    }
}