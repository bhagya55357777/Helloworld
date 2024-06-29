package place;

public class rev2 {
	public static void main(String[] args) {
		int number=1234,reverse=0;
		for(;number!=0;) {
			 int remainder=number%10;
			 reverse=reverse*10+remainder;
			 number=number/10;
			
		}
		System.out.println("the reverse of a given number is:"+reverse);
		

	}

}



