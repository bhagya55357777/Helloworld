package place;

public class automorphicno {
	static boolean isautomorphic(int num) {
		int square=num*num;
		while(num>0) {
			if(num%10!=square%10) 
				return false;
			
			num=num/10;
			square=square/10;
		}
		return true;
		
	}
	public static void main(String[]args) {
		System.out.println(isautomorphic(76)?"automorphic":"not automorphic");
		System.out.println(isautomorphic(13)?"automorphic":"not automorphic");
	}
	

}
