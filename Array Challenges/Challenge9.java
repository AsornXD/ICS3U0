import java.util.*;
public class Challenge9 {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 6; j++){
                arr[i][j] = (int)(Math.random() * (20-0) + 0) + 1;
            }
        }
        System.out.println("Enter the names of 5 students:");
        Scanner input = new Scanner(System.in);
        String [] students = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        int min = arr[1][0];
        for (int i = 1; i < 6; i++){
            if (arr[1][i] < min){
                min = arr[1][i];
            }
        }
        System.out.println("The lowest mark the 2nd student had was " + min + "/20.");
        System.out.println("This is equal to " + (double) Math.round(((min/20.0)*100) * 10d) / 10d + "%.");
        int total = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 6; j++){
                total+=arr[i][j];
            }
        }
        System.out.println("The total mark of all the students is " + total + ".");
    }
}
