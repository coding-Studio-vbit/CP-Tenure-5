class DuplicateNum {
    public int findDuplicate(int[] nums) {
        int tortoise = 0;
        int hare = 0;
        for(int i = 0; i<nums.length; i++){
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            if(tortoise == hare){
                break;
            }
        }
        tortoise = 0;
        for(int i = 0; i<nums.length; i++){
            tortoise = nums[tortoise];
            hare = nums[hare];
            if(tortoise == hare){
                break;
            }
        }
        return tortoise;
    }
}