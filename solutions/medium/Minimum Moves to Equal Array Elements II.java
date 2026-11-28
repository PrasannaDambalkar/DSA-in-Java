// Title: Minimum Moves to Equal Array Elements II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/

        Arrays.sort(nums);

        int n = nums.length;
        int m = n / 2;


        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

        }
            ans += Math.abs(nums[m] - nums[i]);

    }

        return ans;
}
