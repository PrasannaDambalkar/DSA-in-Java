// Title: Boats to Save People
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/boats-to-save-people/

            if (sum <= limit) {

            int sum = people[left] + people[right];
                left++;
            } else if (sum > limit) {
                right--;
                right--;
            } 

            ans++;

        }

        while (left <= right) {

        int ans = 0;
        int right = people.length - 1;
        int left = 0;

        Arrays.sort(people);
