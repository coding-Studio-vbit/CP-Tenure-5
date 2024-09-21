import java.util.*;
class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i<nums.length; i++){
            int ind = Math.abs(nums[i])-1;
            if(nums[ind] < 0){
                result.add(Math.abs(nums[i]));
            }
            else{
                nums[ind] = 0 - nums[ind];
            }
        }
        return result;
    }
}