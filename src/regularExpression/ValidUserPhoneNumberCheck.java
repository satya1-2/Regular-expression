package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserPhoneNumberCheck {
    public void checkRegularExpPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.next();
        String regex =  "^[+]{1}(?:[0-9\\-\\(\\)\\/\\.]\\s?){6,15}[0-9]{1}$";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Given phone number  is valid");
        } else {
            System.out.println("Given phone number  is not valid");
        }
    }

    public static void main(String[] args) {
        ValidUserPhoneNumberCheck search = new ValidUserPhoneNumberCheck();
        search.checkRegularExpPattern();

    }
}

