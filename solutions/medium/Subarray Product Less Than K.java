// Title: Subarray Product Less Than K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/subarray-product-less-than-k/


            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left];
            }
                left++;
        while (right < nums.length) {

            right++;

        int ans = 0;
            ans += right - left;

        return ans;
        }
            
