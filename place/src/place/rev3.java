package place;
import java.util.Scanner;

public class rev3 {
	public static void reversenumber(int number) {
		if(number<10) {
			System.out.println(number);
			return;
		}
			else {
				System.out.print(number%10);
				reversenumber(number/10);
			}
		
			
	}
	public static void main(String args[]) {
		System.out.print("enter the number that to be reversed:");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("the reverse of a given number is:");
		reversenumber(num);
		
		
	}
	

}

