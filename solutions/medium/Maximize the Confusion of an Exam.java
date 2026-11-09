// Title: Maximize the Confusion of an Exam
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximize-the-confusion-of-an-exam/

            while (count > k) {

                if (answerKey.charAt(left) != ch) {
                    count--;
                }

                left++;

            }

            ans = Math.max(ans, right - left + 1);

        }

    }

        return ans;
}
