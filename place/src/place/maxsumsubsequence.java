package place;

public class maxsumsubsequence {
	public static double maxavg(int[]nums,int k){
		double maxsum=0;
		for(int i=0;i<k;i++) {
			maxsum +=nums[i];
		}
		double currentsum=maxsum;
		for(int i=k;i<nums.length;i++) {
			currentsum +=nums[i]-nums[i-k];
			maxsum=Math.max( maxsum,currentsum);
			
		}
		return maxsum/k;
		}
	public static void main(String[]args) {
		int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println("averageofmaxsum :"+maxavg(nums,k));
	}

}
