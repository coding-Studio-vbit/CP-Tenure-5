import java.util.*;
class Happy {
    public boolean isHappy(int n) {
        HashSet <Integer> happy = new HashSet <Integer>();
        while((n!=1)&&(!happy.contains(n))){
            happy.add(n);
            int sum = 0;
            while(n > 0){
                int r = n%10;
                n/=10;
                sum += r*r;
            }
            n = sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }
}