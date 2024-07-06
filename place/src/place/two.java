package place;

//all possible combinations
	

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	public class two {

	
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

	        List<int[]> results = findTwoSum(numbers, target);
	        if (!results.isEmpty()) {
	            System.out.println("Pairs of positions that add up to the target sum:");
	            for (int[] result : results) {
	                System.out.println("Positions: " + result[0] + " and " + result[1]);
	            }
	        } else {
	            System.out.println("No two numbers add up to the target sum.");
	        }

	        scanner.close();
	    }

	    public static List<int[]> findTwoSum(int[] nums, int target) {
	        List<int[]> resultList = new ArrayList<>();
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[i] + nums[j] == target) {
	                    resultList.add(new int[] { i, j });
	                }
	            }
	        }
	        return resultList; // Return the list of all pairs found
	    }
	}



