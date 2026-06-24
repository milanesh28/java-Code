class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int bananas : piles) {
            high = Math.max(high, bananas);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canFinish(piles, h, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] piles, int h, int speed) {
        long hours = 0;

        for (int bananas : piles) {
            hours += (bananas + speed - 1) / speed; // ceil division
        }

        return hours <= h;
    }
}
