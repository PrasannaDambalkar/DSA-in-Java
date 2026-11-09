// Title: Minimum Consecutive Cards to Pick Up
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/


            if (map.containsKey(temp)) {
                left = map.get(temp);
            }
                ans = Math.min(ans, right - left + 1);



            temp = cards[right];

        for (int right = 0; right < cards.length; right++) {

        int ans = Integer.MAX_VALUE;
        int left;

        HashMap<Integer, Integer> map = new HashMap<>();
        
            map.put(temp, right);

        int temp;
