package placement;
import java.util.*;

public class MaxNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] E = new int[T];
        int[] L = new int[T];

        for(int i=0;i<T;i++)
            E[i] = sc.nextInt();

        for(int i=0;i<T;i++)
            L[i] = sc.nextInt();

        int current = 0;
        int maxGuests = 0;

        for(int i=0;i<T;i++){
            current = current + E[i] - L[i];
            maxGuests = Math.max(maxGuests, current);
        }

        System.out.println(maxGuests);
    }
}
