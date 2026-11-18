// Title: Most Profit Assigning Work
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/most-profit-assigning-work/


        Arrays.sort(worker);

        Arrays.sort(grid, (a, b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        int maxprofit = 0;
        int ans = 0;

        for (int j = 0; j < m; j++) {

            while (i < n && grid[i][0] <= worker[j]) {
                maxprofit = Math.max(grid[i][1], maxprofit);
                i++;
            }

            ans += maxprofit;

        }

        return ans;
