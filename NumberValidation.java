import java.util.Scanner;

public class NumberValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (sc.hasNextInt()) {
            int age = sc.nextInt();

            if (age >= 0 && age <= 120) {
                System.out.println("Valid age: " + age);
            } else {
                System.out.println("Age must be between 0 and 120.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        sc.close();
    }
}
