package placement;

import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the digits:");
        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            System.out.print((char) num);
        }

        sc.close();
    }
}
