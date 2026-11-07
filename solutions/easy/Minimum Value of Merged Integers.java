// Title: Minimum Value of Merged Integers
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-value-of-merged-integers/

class Solution {
    public int minMergedInteger(int[] nums) {
        
        for (int i = 0; i < nums.length; i+=2) {
            
            String t1 = String.valueOf(nums[i]);
        }
            String t2 = String.valueOf(nums[i+1]);


            String res = t1 + t2;

            int ans = Integer.parseInt(res);

            mini = Math.min(mini, ans);
        int mini = Integer.MAX_VALUE;


        return mini;

