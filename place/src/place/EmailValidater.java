package place;
import java.util.Scanner;
//create a program of email validation make sure an email adress follows the rules  has a one@symbol the part before@ doesnt start or end with. or-and the part after@ ends in .com,.netor.org dont use regular expression
public class EmailValidater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email address:");
        String email = sc.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
    }

    public static boolean isValidEmail(String email) {
        // Split the email into parts before and after '@'
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex != email.lastIndexOf('@')) return false;
        
        String first = email.substring(0, atIndex);
        String second = email.substring(atIndex + 1);
        
        // Check the first part
        if (first.isEmpty() || first.startsWith(".") || first.endsWith(".") || 
        		first.startsWith("-") || first.endsWith("-")) return false;

        // Check the second part
        if (second.isEmpty() || !second.contains(".") || 
            !endsWithValidID(second)) return false;
        
        return true;
    }

    public static boolean endsWithValidID(String second) {
        String[] validLDs = {".com", ".net", ".org"};
        for (String ld : validLDs) {
            if (second.endsWith(ld)) {
                return true;
            }
        }
        return false;
    }
}

