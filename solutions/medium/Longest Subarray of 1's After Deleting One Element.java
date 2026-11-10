// Title: Longest Subarray of 1's After Deleting One Element
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-subarray-of-1's-after-deleting-one-element/

            while (zero > 1) {

                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }

            ans = Math.max(ans, right - left);


            }
                zero++;
            if (nums[right] == 0) {

        for (int right = 0; right < nums.length; right++) {

        int ans = 0;
        int zero = 0;
        int left = 0;
