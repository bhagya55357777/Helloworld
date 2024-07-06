package place;

public class multiply {
	public static void main(String[]args) {
		int oddcount=0;
		int evencount=0;
		for(int i=3;i<=7;i++) {
			for(int j=1;j<=10;j++) {
				int product=i*j;
				if(product%2==0) {
					evencount++;
				}
					else {
						oddcount++;
						
					
				}
			}
		}
		System.out.println("count of odd nos: "+oddcount);
		System.out.println("count of even  nos: "+evencount);
	}

}
