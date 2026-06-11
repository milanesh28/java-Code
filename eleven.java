package placement;

import java.util.Scanner;
public class eleven {

	public static void main(String[] args) {
		int n,i=1;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println(i+"x"+n+"="+i);
			i=i*n ;
		}
		
		
	}

}
