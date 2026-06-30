import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String s2 = sc.nextLine();
		int n = s1.length();
		int m = s2.length();
		int [][] dp = new int[n+1][m+1];
		int maxLength = 0;
		for(int i = 1; i <= n; i++){
		    for(int j = 1; j <= m; j++){
		        if(s1.charAt(i - 1) == s2.charAt(j - 1)){
		            dp[i][j] = 0;
		        }
		    }
		}
		System.out.println("Length Of Longest Common Substring: " + maxLength);
	}
}
