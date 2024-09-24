class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1==ch2){
                i += 1;
                j -= 1;
            }
            else{
                if(isPalindrome(s.substring(i, j))){
                    j -= 1;
                }
                else if(isPalindrome(s.substring(i+1, j+1))){
                    i += 1;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s){
        StringBuffer rev = new StringBuffer();
        for(int i = s.length() - 1; i>=0; i--){
            rev.append(s.charAt(i));
        }
        if(s.equals(rev.toString())){
            return true;
        }
        return false;
    }
}