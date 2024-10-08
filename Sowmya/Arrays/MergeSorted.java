class MergeSorted {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while((p1>=0)&&(p2>=0)&&(p>=0)){
            if(nums1[p1]>nums2[p2]){
                nums1[p] = nums1[p1];
                p1 -= 1;
            }
            else{
                nums1[p] = nums2[p2];
                p2 -= 1;
            }
            p -= 1;
        }

        if(p1 >= 0){
            while(p>=0){
                nums1[p] = nums1[p1];
                p -= 1;
                p1 -= 1;
            }
        }
        if(p2 >= 0){
            while(p>=0){
                nums1[p] = nums2[p2];
                p -= 1;
                p2 -= 1;
            }
        }
    }
}