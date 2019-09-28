//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Lvl3Q10 {
    public static void main(String[] args) {
        String answer = "Steins;gate";
        String userAnswer = "";
        Scanner input = new Scanner(System.in);
        while (!(userAnswer.equals(answer)))
        {
            System.out.println("What is may favourite anime?");
            userAnswer = input.nextLine();
        }
        System.out.println("Correct!");
    }
}
