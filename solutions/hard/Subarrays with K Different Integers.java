// Title: Subarrays with K Different Integers
            // Difficulty: Hard
            // Language: Java
            // Link: https://leetcode.com/problems/subarrays-with-k-different-integers/


                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                    count--;
                }

                left++;

            }

                ans += (right - left + 1);

        }

        return ans;

    }

