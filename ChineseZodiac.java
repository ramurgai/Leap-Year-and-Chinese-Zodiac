import java.util.Scanner;

public class ChineseZodiac {
    public static Scanner scanner = new Scanner(System.in);



    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int userYear = getIntInput("Enter the year you were born: ");
        switch (userYear % 12){
            case 0:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Monkey");
                break;
            case 1:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Rooster");
                break;
            case 2:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Dog");
                break;
            case 3:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Pig");
                break;
            case 4:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Rat");
                break;
            case 5:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Ox");
                break;
            case 6:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Tiger");
                break;
            case 7:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Rabbit");
                break;
            case 8:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Dragon");
                break;
            case 9:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Snake");
                break;
            case 10:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Horse");
                break;
            case 11:
                System.out.println("The Chinese Zodiac animal for " + userYear + " is: Sheep");
                break;
        }


    }
}