package place;

public class prime {
	public static void main(String[]args) {
		int i,m=0,flag=0;
		int n=4;
		m=n/2;
		if(n==0||n==1) {
			System.out.print(n+"not a prime no");
			
		}
		else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.print(n+"not a prime no");
					flag=1;
					break;
				
			}
			}
		
			if(flag==0) 
				System.out.print(n+"is a prime no");
		}
			
		
	
	}
}


