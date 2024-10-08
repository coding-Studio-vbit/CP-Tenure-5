import java.util.*;
class MaximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums.length - 1;
        if(nums[last]*nums[last-1]*nums[last-2] > nums[0]*nums[1]*nums[last]){
            return nums[last]*nums[last-1]*nums[last-2];
        }
        return nums[0]*nums[1]*nums[last];
    }
}