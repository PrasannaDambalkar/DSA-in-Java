// Title: Divide Players Into Teams of Equal Skill
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/


            if (skill[left] + skill[right] == temp) {
                ans += skill[left]*skill[right];
            } else {
                return -1;
            }

            left++;
        while (left < right) {

            right--;
        long ans = 0;
        int temp = skill[left] + skill[right];
        int right = skill.length - 1;
        int left = 0;

        Arrays.sort(skill);
