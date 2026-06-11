package placement;
import java.util.Scanner;

public class CandyJar {

    public static void main(String[] args) {

        int N = 10;   
        int k = 5;   
        int candiesInJar = N;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Candies available in JAR: " + candiesInJar);
            System.out.print("Enter number of candies to buy: ");

            int input = sc.nextInt();

            if (input > candiesInJar) {
                System.out.println("INVALID INPUT");
            } 
            else {
                candiesInJar = candiesInJar - input;

                System.out.println("NUMBER OF CANDIES SOLD : " + input);
                System.out.println("NUMBER OF CANDIES LEFT : " + candiesInJar);
            }

            S
            if (candiesInJar <= k) {
                candiesInJar = N;
                System.out.println("JAR refilled to " + N + " candies");
            }
        }
    }
}
