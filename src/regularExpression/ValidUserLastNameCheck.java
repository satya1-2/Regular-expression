package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserLastNameCheck {
    public void checkRegularExpPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();
        Pattern p = Pattern.compile("[a-zA-Z]{3,}");
        Matcher m = p.matcher(lastName);
        boolean b = m.matches();
        System.out.println(b);
    }
    public static void main(String[] args) {
        ValidUserLastNameCheck search = new ValidUserLastNameCheck();
        search.checkRegularExpPattern();

    }
}

