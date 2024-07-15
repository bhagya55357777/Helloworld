package place;
import java.util.Scanner;

public class pivotindex {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of elements in the array");
		int n=scanner.nextInt();
		int []nums=new int[n];
		System.out.println("enter the elements");
		for (int i=0;i<n;i++) {
			System.out.print("element"+(i+1)+":");
			nums[i]=scanner.nextInt();
		
	}
		int pivotindex=findpivotindex(nums);
		if(pivotindex!=-1) {
			System.out.print("pivot element is:"+piv"""
					
					"""otindex);}
		else {
			System.out.print("there is no pivot index");
			}
		scanner.close();
}


public static int findpivotindex(int[] nums) {
int totalsum = 0;
int leftsum = 0;
for(int num:nums) {
	totalsum +=num;
}
for(int i=0;i<nums.length;i++) {
	if(leftsum==totalsum-leftsum-nums[i]) {
		return i;
	}
	leftsum+=nums[i];
}



return -1;
}
}