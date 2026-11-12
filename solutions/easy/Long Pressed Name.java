// Title: Long Pressed Name
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/long-pressed-name/


            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j-1)) {
                j++;
            } else {
                return false;
            }

        }

        return i == name.length();
        while (j < typed.length()) {

        int j = 0;
        int i = 0;
        
    public boolean isLongPressedName(String name, String typed) {
class Solution {
