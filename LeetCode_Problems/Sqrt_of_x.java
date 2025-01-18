class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }

        int start = 1;
        int mid = -1;
        int end = x;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid == x) {
                return mid;
            } else {
                start = mid + 1;
            }
        }

        return Math.round(end);
    }
}
