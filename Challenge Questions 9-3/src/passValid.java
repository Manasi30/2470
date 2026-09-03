/* Password Validator Project that asks the user to input a password. The password must meet certain
criteria such as contain at least 8 characters, at least one uppercase letter, at least one lowercase letter,
and at least one number. The output should either accept the password or reject it, if it doesn't meet the
criteria.
 */


import java.util.Scanner;

public class passValid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Create a password: ");
        String password = input.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(character)) {
                hasLowercase = true;
            }
            if (Character.isDigit(character)) {
                hasNumber = true;
            }
        }

        boolean correctLength = password.length() >= 8;

        if (correctLength && hasUppercase && hasLowercase && hasNumber) {
            System.out.println("Password Accepted!");
        }
        else {
            System.out.println("Password Not Accepted!");
            if (!correctLength) {
                System.out.println("Password must be at least 8 characters!");
            }
            if (!hasUppercase){
                System.out.println("Password must have at least 1 uppercase letter!");
            }
            if (!hasLowercase){
                System.out.println("Password must have at least 1 lowercase!");
            }
            if (!hasNumber){
                System.out.println("Password must have at least 1 number!");
            }
        }
        input.close();

    }
}
