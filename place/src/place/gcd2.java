package place;

public class gcd2 {
	public static void main(String[]args) {
		int n1=12,n2=8;
		while( n1!=n2) {
			if(n1>n2) {
				n1=n1-n2;
				
			}
			else {
				n2=n2-n1;
			}
		}
			System.out.print("the gcd of n1 and n2 is:"+n2);
				
			
		
	}

}
