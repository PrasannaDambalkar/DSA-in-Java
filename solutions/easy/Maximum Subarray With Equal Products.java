// Title: Maximum Subarray With Equal Products
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray-with-equal-products/

    public long findGcd(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public long findLcm(long a, long b) {
        return (a / findGcd(a, b)) * b;
    }

}
