package place;
import java.util.Scanner;
public class twosums {
 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of elements in the list:");
	        int n = scanner.nextInt();

	        int[] numbers = new int[n];
	        System.out.println("Enter the elements of the list:");
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }

	        System.out.println("Enter the target sum:");
	        int target = scanner.nextInt();

	        int[] result = findTwoSum(numbers, target);
	        if (result != null) {
	            System.out.println("Positions: " + result[0] + " and " + result[1]);
	        } else {
	            System.out.println("No two numbers add up to the target sum.");
	        }

	        scanner.close();
	    }

	    public static int[] findTwoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        return null; // No solution found
	    }
	}