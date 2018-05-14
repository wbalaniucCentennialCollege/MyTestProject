package Ex1;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Obstain input from the command window
        Scanner input = new Scanner(System.in);

        // Instance of account object
        Account myAccount = new Account();

        // Displays the default account name (which is null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());
    }
}
