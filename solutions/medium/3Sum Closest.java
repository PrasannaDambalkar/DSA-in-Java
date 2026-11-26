// Title: 3Sum Closest
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/3sum-closest/


            while (left < right) {

            int right = n - 1;
            int left = i + 1;

        for (int i = 0; i < n-2; i++) {
        
        Arrays.sort(nums);
                int sum = nums[left] + nums[right] + nums[i];
                int diff = Math.abs(sum - target);
                
                if (diff < prev) {
                    prev = diff;
                    ans = sum;
                }
