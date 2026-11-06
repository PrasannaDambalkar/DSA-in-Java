// Title: Number of Substrings Containing All Three Characters
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/


                ans += n - right;

            while (a >= 1 && b >= 1 && c >= 1) {
                char leftchar = s.charAt(left);
                map.put(leftchar, map.get(leftchar) - 1);

                left++;

                a = map.getOrDefault('a', 0);
                b = map.getOrDefault('b', 0);
                c = map.getOrDefault('c', 0);

            int b = map.getOrDefault('b', 0);
            int c = map.getOrDefault('c', 0);


            int a = map.getOrDefault('a', 0);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            char ch = s.charAt(right);
