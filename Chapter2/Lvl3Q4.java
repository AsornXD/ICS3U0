//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Lvl3Q4 {
    public static void main(String[] args)
    {
        String friend = "";
        int count = 0;
        Scanner input = new Scanner(System.in);
        while (!friend.equals("done"))
        {
            System.out.println("Enter a friend's name: ");
            friend = input.nextLine();
            count++;
        }
        System.out.println("You have " + count + " friends.");
    }
}
