// Title: Trionic Array I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/trionic-array-i/

        int j = p;

        while (j < nums.length-2 && nums[j] > nums[j+1]) {
            p += 1;
            j++;
        }

        int p = q;

        if (p == q) {
            return false;
        }

        int k = p;

        while (k < nums.length-1 && nums[k] < nums[k+1]) {
            k++;
        }

        if (k != nums.length-1) {
