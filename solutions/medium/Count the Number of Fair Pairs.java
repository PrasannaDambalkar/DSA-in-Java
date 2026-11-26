// Title: Count the Number of Fair Pairs
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-the-number-of-fair-pairs/


        while (left < right) {
        long ans = 0;
        int right = nums.length - 1;
        int left = 0;

    public long countPairs(int limit, int[] nums) {

    }

            if (nums[left] + nums[right] <= limit) {
                ans += right - left;
                left++;
            } else {
                right--;
            }
            
