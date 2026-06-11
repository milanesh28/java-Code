package placement;

import java.util.Scanner;
public class classmain{
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result += a;
        }
        return result;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial = multiply(factorial, i);
        }
         System.out.println(factorial);
    }
}
