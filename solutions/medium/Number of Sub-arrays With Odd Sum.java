// Title: Number of Sub-arrays With Odd Sum
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/

            prefix += num;

            if (prefix % 2 == 0) {
                ans = (ans + odd) % mod;
            } else {
                even++;

        for (int num : arr) {

        long ans = 0;
        int prefix = 0;

                ans = (ans + even) % mod;
                odd++;
            }

        }

        return (int) ans;

    }
