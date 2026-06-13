package placement;

import java.util.Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {10,3,4,5,-9,6};

        Arrays.sort(arr);
        System.out.println("Second maximum: " + arr[arr.length - 2]);
    }
}
