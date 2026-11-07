// Title: Count Number of Nice Subarrays
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-number-of-nice-subarrays/

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {


        map.put(0, 1);

            if (nums[i] % 2 == 1) {
                num = 1;
            } else {
                num = 0;
            }
            prefix += num;

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);

            if (map.containsKey(prefix - k)) {
                ans += map.get(prefix - k);
            }

