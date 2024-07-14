package place;

public class productrray {
	public static int[] prodarray(int[]nums){
		int n=nums.length;
		int[] result=new int[n];
		for(int i=0;i<n;i++) {
			result[i]=1;
			}
		int leftproduct=1;
		for(int i=0;i<n;i++) {
			result[i] *=leftproduct;
			leftproduct *=nums[i];
			}
		int rightproduct=1;
		for(int i=n-1;i>=0;i--) {
			result[i] *=rightproduct;
			rightproduct *=nums[i];
			}
		return result;
		}
	public static void main(String[] args) {
		int []nums= {1,2,3,4};
		int []result=prodarray(nums);
		for(int value:result) {
			System.out.println(value+" ");
		}

}
}
 



















