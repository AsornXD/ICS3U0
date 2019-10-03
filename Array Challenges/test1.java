//Askari Abbas
//ICS3U0
import java.util.*;
public class test1 {
    public static void main(String[] args) {
        //Part 1 Code
        String answer = ""; // initializes answer
        String phonenum = ""; // ^
        Scanner in = new Scanner(System.in); //sets up the scanner
        do {
            System.out.println("Do you want a Mississauga or Toronto number? ");
            String choice = in.nextLine(); // gets users choice of city
            if (choice.equals("Toronto")) { //if the user's city is toronto it will run the program with the designated starting number
                phonenum = "416 - ";
                int num1 = (int) (Math.random() * (999-100) + 1)+100; //randomizes nums 3-6, min is 100 to not have a value that would give a digit count of < 3.
                phonenum += num1 + " - "; //adds nums 3-6 and a dash to the full phone number
                int num2 = (int) (Math.random() * (9999-1000) + 1) + 1000; //repeats but with numbers 6-10
                phonenum += num2; //does not add a dash this time because it's the end of the number
            } else if (choice.equals("Mississauga")) { //if user chooses mississauga the code repeats but with a starting number of 905
                phonenum = "905 - ";
                int num1 = (int) (Math.random() * (999 - 100) + 1) + 100;
                phonenum += num1 + " - ";
                int num2 = (int) (Math.random() * (9999 - 1000) + 1) + 1000;
                phonenum += num2;
            }
            else{ //if they enter something other than mississauga or toronto
                System.out.println("Please enter in a valid city.");
                answer = "Yes"; //sets answer to yes so the code repeats
            }
            if (choice.equals("Toronto") || choice.equals("Mississauga")) { //if the city was valid then it will process a deal for them
                int giftcard = (int) (Math.random() * (125 - 25) + 1) + 25; //randomizes the gift card amount
                System.out.println("Your new phone number is " + phonenum + " with a free gift card of $" + giftcard + "!");
                System.out.println("Do you want a different deal?");
                answer = in.nextLine(); //sets answer to the the choice the user gave
                while (!(answer.equals("Yes"))&& !(answer.equals("No"))){ //catches if the user answers something other than yes or no
                    System.out.println("Please enter Yes/No");
                    answer = in.nextLine(); //gets new answer
                }
            }
            System.out.println("");
        } while (answer.equals("Yes")); // if the user said yes to wanting a new deal, then the code repeats
        System.out.println("Congrats on your new phone number!");

    }
}
