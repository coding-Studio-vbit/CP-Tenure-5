class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low += 1;
                mid += 1;
            }
            else if(nums[mid]==1){
                mid += 1;
            }
            else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high -= 1;
            }
        }
    }
}