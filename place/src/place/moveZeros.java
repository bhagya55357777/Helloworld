package place;

public class moveZeros {
	public static void movezeros(int []nums) {
		if(nums==null ||nums.length==0) {
			return;
		}
		int insertpos=0;
		for(int num:nums) {
			if(num!=0) {
				nums[insertpos++]=num;
			}
				
		}
		while(insertpos <nums.length) {
			nums[insertpos++]=0;
		}
	}
	public static void main(String[]args) {
		int[] nums={0, 1, 0, 3, 12};
		movezeros(nums);
		for(int num :nums) {
			System.out.println(num+" ");
	}

}
}

