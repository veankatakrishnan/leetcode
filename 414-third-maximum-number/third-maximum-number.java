class Solution {
    public int thirdMax(int[] nums) {
        Long fmax = null;
        Long smax = null;
        Long tmax = null;

        for(int i = 0; i < nums.length; i++){
            if((fmax != null && fmax == nums[i])||(tmax != null && tmax == nums[i])||(smax != null && smax == nums[i]))
                continue;
            if(fmax == null || fmax < nums[i]){
                tmax = smax;
                smax = fmax;
                fmax = (long)nums[i];
            }
            else if(smax == null || nums[i] > smax){
                tmax = smax;
                smax = (long)nums[i];
            }
            else if(tmax == null || nums[i] > tmax){
                tmax = (long)nums[i];
            }
        }
        return tmax == null ? fmax.intValue() : tmax.intValue();
    }
}