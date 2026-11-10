// Title: Maximum Length Substring With Two Occurrences
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/


        for (int right = 0; right < s.length(); right++) {

        }
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        HashMap<Character, Integer> map = new HashMap<>();

            char ch = s.charAt(right);

            while (map.get(ch) > 2) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
            }
                left++;

            ans = Math.max(ans, right - left + 1);

        return ans;

    }
