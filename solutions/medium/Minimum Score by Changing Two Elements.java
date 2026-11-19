// Title: Minimum Score by Changing Two Elements
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-score-by-changing-two-elements/

class Solution {
    public int minimizeSum(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;

        return Math.min(nums[n-1] - nums[2], Math.min(nums[n-3] - nums[0], nums[n-2] - 

    }
        nums[1]));
}
