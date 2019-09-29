//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Challenge1 {
    public static void main(String[] args) {
        String[] names;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first names of 8 friends (Press enter to move onto the next friend):");
        names = new String[] {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        int maxLength = Integer.MIN_VALUE;
        String maxWord = "";
        for (int i = 0; i < 8; i++)
        {
            if (names[i].length() > maxLength){
                maxLength = names[i].length();
                maxWord = names[i];
            }
        }
        System.out.println(maxWord + " has the longest name with a length of " + maxLength + " letters.");
    }
}
