class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int num : nums){
            if(i==0){
                i+=1;
            }
            else if(nums[i-1]!=num){
                nums[i]= num;
                i+=1;
            }
        }
        for(int j = 0; j<nums.length; j++){
            System.out.print(nums[j] + " ");
        }
        return i;
    }
}