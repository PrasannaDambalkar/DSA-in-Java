// Title: Maximum Number of Items From Sale I
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-number-of-items-from-sale-i/

        int ans = 0;

        for (int i = 0; i <= budget; i++) {

            ans = Math.max(ans, dp[i] + (budget - i) / minPrice);

        }

        return ans;

    }
}
