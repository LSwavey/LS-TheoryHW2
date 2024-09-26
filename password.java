import java.util.Scanner; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password {
    // Function to validate
    public static boolean validate(String password) {
        // Regular expression
        String regex = "^[A-Z][A-Za-z0-9]{6}[!@#$&]$";
        
        // Compile the pattern using the regex
        Pattern pat = Pattern.compile(regex);
        
        // Match the password
        Matcher match = pat.matcher(password);
        
        // Return
        return match.matches();
    }

    public static void main(String[] args) {
        // Loop until the correct password is entered
        try (Scanner scan = new Scanner(System.in)) {
            // Loop until the correct password is entered
            while (true) {
                System.out.print("--> Enter the password: ");
                String password = scan.nextLine();
                
                // Validate
                if (validate(password)) {
                    System.out.println("Correct Password");
                    break; // Exit the loop if the password is correct
                } else {
                    System.out.println("Incorrect Password");
                }
            }
            // Close the scanner
        }
    }
}
