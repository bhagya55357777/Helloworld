package place;

public class insert {
	public static void insert(int arr[]) {
		int  n=arr.length;
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String args[]) {
		int arr[]= {1,23,34,6,8};
		System.out.println("before sorting");
		for(int j:arr) {
			System.out.print(j+" ");
			
		}
		System.out.println();
		insert(arr);
		System.out.println("after sorting:");
		for(int j:arr) {
			System.out.print(j+" ");
			
		
	}
	

}
}
