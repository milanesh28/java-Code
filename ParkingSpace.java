package placement;
import java.util.*;

public class ParkingSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] arr = new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxCount = -1;
        int rowIndex = -1;
        for(int i=0;i<R;i++){
            int count = 0;
            for(int j=0;j<C;j++){
                if(arr[i][j] == 1)
                    count++;
            }
         if(count > maxCount){
                maxCount = count;
                rowIndex = i + 1;
            }
        }
        System.out.println(rowIndex);
    }
}
