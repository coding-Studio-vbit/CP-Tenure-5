class ContainsMostWater {
    public int maxArea(int[] height) {
        int max_water = 0;
        int i = 0;
        int j = height.length - 1;

        while(i<j){
            if(height[i] < height[j]){
                int product = height[i]*(j-i);
                i += 1;
                if(product > max_water){
                    max_water = product;
                }
            }
            else{
                int product = height[j]*(j-i);
                j -= 1;
                if(product > max_water){
                    max_water = product;
                }
            }
        }

        return max_water;
    }
}