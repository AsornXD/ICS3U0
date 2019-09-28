import java.util.*;
public class Challenge3 {
    public static void main(String[] args) {
        String[] names;
        int[] numbers;
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("This program will output the person with the highest IQ.");
        System.out.println("Enter the names of 6 of your friends:");
        names = new String[]{input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        numbers = new int[]{getrandom(),getrandom(),getrandom(),getrandom(),getrandom(),getrandom(),};
        String maxname = names[0];
        int maxnum = numbers[0];
        for (int i = 1; i < 6; i++) {
            if (numbers[i] > maxnum) {
                maxnum = numbers[i];
                maxname = names[i];
            }
        }
        System.out.println("Name: " + maxname + " IQ: " + maxnum);
    }

    private static int getrandom(){
        return (int)(Math.random() * (160-60) + 60) + 1;
    }
}
