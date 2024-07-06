package place;
//find the count of all the odd and even numbers in a multplication table btween 3 and 7.take input fromuser
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end numbers for the multiplication table:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int oddCount = 0, evenCount = 0;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                int product = i * j;
                if (product % 2 == 0) evenCount++;
                else oddCount++;
            }
        }

        System.out.println("Odd count: " + oddCount);
        System.out.println("Even count: " + evenCount);
    }
}
