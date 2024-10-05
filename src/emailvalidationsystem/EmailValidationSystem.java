package emailvalidationsystem;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String emailPattern = "^2300(724722|704764|704803|704815|704858)@mubs\\.ac\\.ug$"; //"\\d{6}" u can use this to check for length of the inputs whether they correspond with the ones in the system
        Pattern pattern = Pattern.compile(emailPattern);
        String email = "";
      

        while (true) {
            System.out.print("Enter your student email address: ");
            email = input.nextLine();
            Matcher matcher = pattern.matcher(email);
           
            
            if (matcher.matches()) {
                System.out.println("Email is valid and meets the requirements.");
                break;
            } else {
                System.out.println("Invalid email. '2300#%error%#@mubs.ac.ug' Please try again.");
            }
        }

        input.close();
    }
}
