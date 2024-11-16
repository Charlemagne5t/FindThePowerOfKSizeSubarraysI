import java.util.Arrays;

class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1) {
            return nums;
        }
        int n = nums.length;
        int c = 1;
        int[] res = new int[n - k + 1];
        Arrays.fill(res, -1);
        
        
        for(int i = 1; i < n; i++) {

            if(nums[i] - nums[i - 1] == 1) {
                c++;
            }else c = 1;

            if(c == k && i - k + 1 >=0) {
                res[i - k + 1] = nums[i];
                c--;
            }
        }

        return res; 
    }
}