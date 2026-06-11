package placement;

public class MinMax2D {
    public static void main(String[] args) {
        int[][] arr = {
            {12, 5, 9},
            {20, 3, 7},
            {15, 8, 2}
        };
        int largest = arr[0][0];
        int smallest = arr[0][0];
          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];}
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];{}{}{}{}[]
                }
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}
