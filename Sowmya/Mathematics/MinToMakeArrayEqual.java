class MinToMakeArrayEqual {
    public int minMoves(int[] nums) {
        int minimum = min(nums);
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        return sum - nums.length*minimum;
    }
    public static int min(int[] nums){
        int m = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(m > nums[i]){
                m = nums[i];
            }
        }
        return m;
    }
}