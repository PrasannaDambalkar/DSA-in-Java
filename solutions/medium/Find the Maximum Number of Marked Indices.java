// Title: Find the Maximum Number of Marked Indices
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-maximum-number-of-marked-indices/


        int left = 0;
        int right = (n+1) / 2;
        int ans = 0;

        while (left < n/2 && right < n) {

            if (nums[left]*2 <= nums[right]) {

                ans += 2;
            }
                left++;
        }
        
    }

            right++;

        return ans;
}
