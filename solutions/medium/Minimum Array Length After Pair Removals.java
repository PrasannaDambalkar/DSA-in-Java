// Title: Minimum Array Length After Pair Removals
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-array-length-after-pair-removals/

            if (nums.get(i).equals(nums.get(i-1))) {
                count++;
            } else {
                count = 1;
            }

            maxFreq = Math.max(maxFreq, count);

        for (int i = 1; i < n; i++) {

        }
        int n = nums.size();
        int count = 1;

        return Math.max(n%2, 2*maxFreq - n);

    }
