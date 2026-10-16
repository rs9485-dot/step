public class ExamScoreBandCounter {
    static int firstPosition(int[] scores, int target, boolean strict) {
        int low = 0, high = scores.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (strict ? scores[mid] <= target : scores[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    static int countInBand(int[] scores, int low, int high) {
        int start = firstPosition(scores, low, false);
        int end = firstPosition(scores, high, true);

        return end - start;
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};

        System.out.println(countInBand(scores, 42, 58));
        System.out.println(countInBand(scores, 90, 100));
    }
}