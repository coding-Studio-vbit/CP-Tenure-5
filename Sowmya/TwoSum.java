import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(hm.containsKey(difference)){
                return new int[] {i, hm.get(difference)};
            }
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}