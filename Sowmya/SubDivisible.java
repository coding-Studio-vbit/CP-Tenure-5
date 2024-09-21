import java.util.*;
class SubDivisible {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        map.put(0,1);
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            int remainder = sum%k;
            if(remainder < 0){
                remainder += k;
            }
            if(map.containsKey(remainder)){
                result += map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0)+1);
        }
        return result;
    }
}