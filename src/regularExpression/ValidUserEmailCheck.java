package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserEmailCheck {
    public void checkRegularExpPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email id: ");
        String gmail = scanner.next();
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(gmail);
        if (matcher.matches()) {
            System.out.println("Given email id is valid");
        } else {
            System.out.println("Given email id is not valid");
        }
    }

    public static void main(String[] args) {
        ValidUserEmailCheck search = new ValidUserEmailCheck();
        search.checkRegularExpPattern();

    }
}

