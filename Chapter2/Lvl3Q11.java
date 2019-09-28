//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Lvl3Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word1 = input.nextLine();
        System.out.println("Enter a word: ");
        String word2 = input.nextLine();
        System.out.println("Enter a word: ");
        String word3 = input.nextLine();
        int maxLength = -9999999;
        for (int i = 0; i < 3; i++){
            if (i == 0)
            {
                maxLength = word1.length();
            }
            if (i == 1)
            {
                if (word2.length() > maxLength)
                {
                    maxLength = word2.length();
                }
            }
            if (i == 2)
            {
                if (word3.length() > maxLength){
                    maxLength = word3.length();
                }
            }
        }
        if (word1.length() == maxLength)
        {
            System.out.println(word1);
        }
        if (word2.length()  == maxLength)
        {
            System.out.println(word2);
        }
        if (word3.length() == maxLength)
        {
            System.out.println(word3);
        }
    }
}
