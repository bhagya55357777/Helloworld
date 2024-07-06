package place;
import java.util.Scanner;
//for negative and special characters
public class Fiz {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number up to which you want to count: ");
            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                throw new IllegalArgumentException("Special characters or non-numeric input are not allowed.");
            }

            int n = Integer.parseInt(input);

            if (n < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }

            for (int i = 1; i <= n; i++) {
                printFizzBuzz(i);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void printFizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
}



