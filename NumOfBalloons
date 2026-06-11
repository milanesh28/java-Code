package placement;
import java.util.*;

public class NumOfBalloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();    
        String[] B = new String[n];
        for (int i = 0; i < n; i++) {
            B[i] = sc.next();
        }

        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            count.put(B[i], count.getOrDefault(B[i], 0) + 1);
        }

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (count.get(B[i]) % 2 != 0) {
                System.out.println(B[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("All are even");
        }
    }
}
