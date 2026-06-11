package placement;

public class Digits {
    public static void main(String[] args) {
        String str = "123456";
        if (str.matches("\\d+")) {
            System.out.println("Contains only digits");
        } else {
            System.out.println("Does not contain only digits");
        }
    }
}
