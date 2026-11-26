// Title: Maximize Greatness of an Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximize-greatness-of-an-array/


        while (right < nums.length) {

            if (nums[right] > nums[left]) {

        Arrays.sort(nums);
                ans++;
                left++;
            }

        int right = 0;
        int left = 0;
        int ans = 0;
        
    public int maximizeGreatness(int[] nums) {
            right++;

