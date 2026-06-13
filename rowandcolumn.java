package placement;

import java.util.Scanner;

public class rowandcolumn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the rows:");
		int row=in.nextInt();
		System.out.print("Enter the column:");
		int column=in.nextInt();
		int[][]a=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
                  System.out.println(a[i][j]+"");
			}
		}
	}
}
