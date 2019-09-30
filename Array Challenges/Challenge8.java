import java.util.*;
public class Challenge8 {
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
        int min = arr[0][5];
        int ind = 0;
        for (int i = 1; i < 5; i++){
            if (arr[i][5] < min){
                min = arr[i][5];
                ind = i;
            }
        }
        System.out.println("The student with the lowest mark on the test is " + students[ind] + ".");
    }
}
