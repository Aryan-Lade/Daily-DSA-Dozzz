public class Solution {
    public int maxSubArray(int[] nums) {
        int x=nums[0],a=nums[0],n=nums.length;
        for (int i=1;i<n;i++) {
            if (a+nums[i]>=nums[i]) {
                a=a+nums[i];
            } else {
                a=nums[i];
            }            
            if (a>x) {
                x=a;
            }
        }        
        return x;
    }
} {
    
}
