package place;
import java.util.Scanner;

public class Fizzy {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number up to which you want to count: ");
	        int n = scanner.nextInt();

	        try {
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



