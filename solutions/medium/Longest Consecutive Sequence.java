// Title: Longest Consecutive Sequence
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-consecutive-sequence/

        for (int num : set) {

            if (!set.contains(num-1)) {

                int count = 1;
                int curr = num;

                while (set.contains(curr+1)) {

        int ans = 0;
                    curr++;
                    count++;
                }

                ans = Math.max(ans, count);

            }

        }

