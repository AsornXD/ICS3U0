//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Lvl3Q3 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks do you have? ");
        int marksCounts = input.nextInt();
        int total = 0;
        for (int i = 0; i < marksCounts; i++)
        {
            System.out.println("Enter a mark: ");
            total+=input.nextInt();
        }
        System.out.println("Your average is: " + (double) total / marksCounts);
    }
}
