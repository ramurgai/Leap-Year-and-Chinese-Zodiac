import java.util.Scanner;

public class LeapYear {
    public static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Your code goes here
        // Use getInput("Enter something: ") for strings
        // Use getIntInput("Enter a number: ") for integers
        int userYear = getIntInput("Enter a year: ");
        if (userYear % 4 == 0){
            if (userYear % 100 == 0){
                if (userYear % 400 == 0){
                    System.out.println(userYear + " is a leap year.");
                }
                else{
                    System.out.println(userYear + " is not a leap year.");
                }

            }
            else{
                System.out.println(userYear + " is a leap year.");
            }
        }
        else{
            System.out.println(userYear + " is not a leap year.");
        }
    }


}