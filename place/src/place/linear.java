package place;

public class linear {
	public static int linear(int arr[],int key) {
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]==key) {
				return i;
		}
		
	}
	return -1;
}
	public static void main(String[]args) {
		int arr[]= {10,20,30,40,50,60};
		int key=10;
		System.out.println(key+"the key is found at index:"+linear(arr,key));
		
	}
}
	



