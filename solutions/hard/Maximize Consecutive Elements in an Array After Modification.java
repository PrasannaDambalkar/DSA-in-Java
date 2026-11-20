// Title: Maximize Consecutive Elements in an Array After Modification
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/

        int ans = 0;

        for (int x : nums) {

            int a = dp.getOrDefault(x - 1, 0) + 1;
            int b = dp.getOrDefault(x, 0) + 1;

            dp.put(x, Math.max(dp.getOrDefault(x, 0), a));
            dp.put(x + 1, Math.max(dp.getOrDefault(x + 1, 0), b));

            ans = Math.max(ans, Math.max(dp.get(x), dp.get(x + 1)));
        }

        return ans;

        Map<Integer, Integer> dp = new HashMap<>();

    }
}
        Arrays.sort(nums);
