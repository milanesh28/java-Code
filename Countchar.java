package placement;

import java.util.*;

	public class Countchar {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String str1 = sc.nextLine();
	        String str2 = sc.nextLine();

	        Set<Character> uniqueChars = new HashSet<>();

	        for (char c : str2.toCharArray()) {
	            uniqueChars.add(c);
	        }

	        int total = 0;

	        for (char c : uniqueChars) {
	            for (char ch : str1.toCharArray()) {
	                if (ch == c) {
	                    total++;
	                }
	            }
	        }

	        System.out.println(total);
	    }
	}
