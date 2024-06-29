package place;

public class binary {
	public static void binary(int arr[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
				
			}
			else if (arr[mid]==key) {
				System.out.print("the key found at index:"+mid);
				break;
				
				
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
			
		}
		if(first>last){
			System.out.print("the key not found:");
			
		}
		
		
	}
	public static void main(String[]args) {
		int arr[] = {10,20,30,40,50};
		int key=40;
		int last=arr.length-1;
		binary(arr,0,last,key);
	}

}
