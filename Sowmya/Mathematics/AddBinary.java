class AddBinary {
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while((i>=0)&&(j>=0)){
            int n1 = a.charAt(i) - '0';
            int n2 = b.charAt(j) - '0';
            result = String.valueOf(n1^n2^carry) + result;
            carry = (n1 & n2) | (carry & (n1 ^ n2));
            i -= 1;
            j -= 1;
        }
        while(i >= 0){
            int n1 = a.charAt(i) - '0';
            result = String.valueOf(n1^carry) + result;
            carry &= n1;
            i -= 1;
        }
        while(j >= 0){
            int n2 = b.charAt(j) - '0';
            result = String.valueOf(n2^carry) + result;
            carry &= n2;
            j -= 1;
        }
        if(carry==1){
            result = '1' + result;
        }
        return result;
    }
}