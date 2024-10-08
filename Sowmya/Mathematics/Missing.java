class Missing {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = sum(nums);
        int actual_total = n*(n+1)/2;
        return actual_total - total;
    }
    public static int sum(int[] nums){
        int s = 0;
        for(int i = 0; i<nums.length; i++){
            s += nums[i];
        }
        return s;
    }
}