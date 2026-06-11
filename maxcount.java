package placement;

import java.util.Scanner;

public class maxcount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        int maxCount = 0;
	        int rowIndex = -1;

	        for (int i = 0; i < n; i++) {
	            int count = 0;

	            for (int j = 0; j < m; j++) {
	                int value = sc.nextInt();
	                if (value == 1) {
	                    count++;
	                }
	            }

	            if (count > maxCount) {
	                maxCount = count;
	                rowIndex = i;
	            }
	        }

	        System.out.println(rowIndex);
	    }
	}
