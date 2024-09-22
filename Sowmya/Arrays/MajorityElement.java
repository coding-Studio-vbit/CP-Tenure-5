class MajorityElement {
    public int majorityElement(int[] nums) {
        int selected_num = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(count == 0){
                selected_num = nums[i];
            }
            if(nums[i]==selected_num){
                count += 1;
            }
            else{
                count -= 1;
            }
        }
        return selected_num;
    }
}