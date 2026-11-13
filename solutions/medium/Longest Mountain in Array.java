// Title: Longest Mountain in Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/longest-mountain-in-array/


                }
                    right++;
                while (right < arr.length-1 && arr[right] > arr[right+1]) {
                    right++;
                    ans = Math.max(ans, right - left + 1);
                }

                left = right;
                while (right < arr.length-1 && arr[right] < arr[right+1]) {

            if (arr[left] < arr[right]) {

        while (right < arr.length) {
                right++;


        int right = 1;
        int ans = 0;
        int left = 0;

