package placement;

public class EvenandOdd {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 33, 40, 51, 64};
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++; 
            }
        }
        System.out.println("Even elements: " + evenCount);
        System.out.println("Odd elements: " + oddCount);
    }
}
