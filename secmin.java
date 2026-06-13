package placement;

import java.util.Arrays;

public class secmin {
    public static void main(String[] args) {
        int[] arr = {10,3,4,5,-9,6};

        Arrays.sort(arr);
        System.out.println("Second minimum: " + arr[1]);
    }
}
