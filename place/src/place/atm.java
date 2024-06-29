package place;
import java.util.Scanner;
public class atm {
	public static void main(String[]args) {
		int balance=100000,withdraw,deposit;
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("atm machine");
			System.out.println("choose 1 for withdraw:");
			System.out.println("choose 2 for deposit:");
			System.out.println("choose 3 for  check balance:");
			System.out.println("choose 4 for exit:");
			System.out.println("choose the operation that u want to perform:");
			int choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				System.out.print("enter the money to be withdrawn:");
				withdraw=sc.nextInt();
				if(balance>=withdraw) {
					balance=balance-withdraw;
					System.out.println("pls collect ur money" +balance);
				}
				else {
					System.out.println("insufficient balance");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("enter the amt to be deposited");
				deposit=sc.nextInt();
				balance=balance+deposit;
				System.out.println("ur money has been successfully deposited:"+balance);
				System.out.println("");
				break;
			case 3:
				System.out.println("Balance:"+balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
				
					
				
				
			}
				
			
			
		}
		
		
	}

}
