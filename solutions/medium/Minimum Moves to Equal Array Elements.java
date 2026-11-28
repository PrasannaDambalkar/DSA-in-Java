// Title: Minimum Moves to Equal Array Elements
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

        for (int i = 0; i < nums.length; i++) {

        }

            if (nums[i] < mini) {
                mini = nums[i];
            }

        for (int i = 0; i < nums.length; i++) {

            ans += nums[i] - mini;
        }
    }

        return ans;
}
