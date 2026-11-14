// Title: Minimum Positive Sum Subarray
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-positive-sum-subarray/

            if (prefix > 0) {
                ans = Math.min(ans, prefix);
            }


            }
                right++;
                prefix += nums.get(right);
            while (right != i) {
            for (int temp = i; temp < nums.size(); temp++) {

                prefix += nums.get(temp);
                prefix -= nums.get(left);

            left = 0;
            prefix = 0;

        for (int i = l; i <= r; i++) {

            right = 0;
