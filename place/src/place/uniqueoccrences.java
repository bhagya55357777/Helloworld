package place;
import java.util.Scanner;
import java.util.HashSet;
import java.util.HashMap;

public class uniqueoccrences {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements in an array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the elements of a array");
		for(int i=0;i<n;i++) {
			System.out.println("element"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		boolean result = uniqueoccrences(arr);

        // Print the result
        if (result) {
            System.out.println("The number of occurrences of each value is unique.");
        } else {
            System.out.println("The number of occurrences of each value is not unique.");
        }

        // Close the scanner
        sc.close();
    }
	public static boolean uniqueoccrences(int[]arr) {
		HashMap<Integer,Integer> countMap=new HashMap<>();
		HashSet<Integer>occurencesSet=new HashSet<>();
		for(int num:arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	    }
		for(int count:countMap.values()) {
			if(!occurencesSet.add(count)) {
				return false;
			}
	}
		return true;
	}
}



		

		
	











   
    


