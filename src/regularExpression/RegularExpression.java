package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public void checkPasswordRegexpPattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password : ");
        String password = scanner.next();
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Creating a Matcher object
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Given password  is valid");
        } else {
            System.out.println("Given password  is not valid");
        }
    }

    public static void main(String[] args) {
        RegularExpression search = new RegularExpression();
        search.checkPasswordRegexpPattern();

    }
}

