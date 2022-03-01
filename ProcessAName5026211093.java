import java.util.Scanner;
public class ProcessAName5026211093 {
    public static Scanner user_input;
    public static void main(String[] args) {
        user_input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println(changeNameFormat(user_input.nextLine()));
    }
    public static String changeNameFormat(String input) { 
        String firstName, lastName;
        firstName = input.substring(0,1);
        lastName = input.substring(input.indexOf(" ")+1, input.length());
        return lastName + ", " + firstName + ".";
    }
}