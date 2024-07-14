package place;

public class containerwithmostwater {
	public static int maxarea(int[]height) {
		int maxarea=0;
		int left=0;
		int right=height.length-1;
		
		while(left<right) {
			int width=right-left;
			int minheight=Math.min(height[left],height[right]);
			int currentarea=width*minheight;
			maxarea=Math.max(maxarea,currentarea);
			if(height[left]<height[right]){
				left++;
			}
			else
				right--;
			
		}
		return maxarea;
	}
	public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxarea(heights)); // Output: 49
    }

}
