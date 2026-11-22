// Title: Check if All A's Appears Before All B's
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/check-if-all-a's-appears-before-all-b's/

        }
            if (s.charAt(i) == 'a') {
                i++;
            } else {
                break;
            }

        while (i < s.length()) {

            if (s.charAt(i) == 'a') {

                return false;
            }
        }


            i++;
    }

        return true;
