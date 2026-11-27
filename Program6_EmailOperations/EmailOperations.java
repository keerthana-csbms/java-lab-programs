//KEERTHANA G,1WN25CS108, LAB PROGRAM-6
import java.util.Scanner;

public class EmailOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String email = sc.nextLine();

        System.out.println("Length: " + email.length());

        int atIndex = email.indexOf('@');
        if (atIndex != -1) {
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);
            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
            System.out.println("Valid institutional domain: " + domain.equals("bmsce.ac.in"));
        } else {
            System.out.println("Invalid email format");
        }

        System.out.println("Lowercase: " + email.toLowerCase());

        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine();
        System.out.println("Starts with prefix: " + email.startsWith(prefix));

        System.out.println("Ends with bmsce.ac.in: " + email.endsWith("bmsce.ac.in"));

        System.out.println("Replaced: " + email.replace("bmsce.ac.in", "cse.bmsce.ac.in"));

        System.out.print("Enter sequence to check: ");
        String seq = sc.nextLine();
        System.out.println("Contains sequence: " + email.contains(seq));

        System.out.println("Trimmed: '" + email.trim() + "'");

        System.out.print("Enter second email: ");
        String email2 = sc.nextLine();
        System.out.println("Emails identical (ignore case): " + email.trim().equalsIgnoreCase(email2.trim()));
    }
}