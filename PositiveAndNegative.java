package placement;

public class PositiveAndNegative{
    public static void main(String[] args) {
        int[] arr = {3, -1, 0, 7, -5, 2};

        int positiveCount = 0;
        int negativeCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        System.out.println("Positive elements: " + positiveCount);
        System.out.println("Negative elements: " + negativeCount);
    }
}
