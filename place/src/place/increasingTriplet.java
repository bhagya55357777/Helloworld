package place;

public class increasingTriplet {
	public static Boolean incretrip(int[]nums) {
		if(nums==null || nums.length<3)
			return false;
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		for(int num:nums) {
			if(num<=first) {
				first=num;
			}
			else if(num<=second) {
				second=num;
			}
			else
				return true;
		}
		return false;
	}
	public static void main(String[]args) {
		int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        
        System.out.println(incretrip(nums1)); // Output: true
        System.out.println(incretrip(nums2)); // Output: false
        System.out.println(incretrip(nums3)); // Output: true
	}

}
