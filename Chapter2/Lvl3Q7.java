//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Lvl3Q7 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int userAnswer = 0;
        Scanner input = new Scanner(System.in);
        while (num1 * num2 == userAnswer){
            num1 = (int)(Math.random() * (9-1) + 1) + 1;
            num2 =  (int)(Math.random() * (9-1) + 1) + 1;
            System.out.println(num1 +" * " + num2 + " = ");
            userAnswer = Integer.parseInt(input.nextLine());
        }
        System.out.println("oops!");
    }
}
