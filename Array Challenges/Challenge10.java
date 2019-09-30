import java.util.*;
public class Challenge10 {
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
        int[] total = new int[5];
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for (int i = 0; i < 5; i++){
            int curTotal = 0;
            for (int j = 0; j < 6; j++){
                curTotal+=arr[i][j];
            }
            System.out.println(curTotal);
            total[i] = curTotal;
            if (curTotal > max){
                ind = i;
                max = curTotal;
            }
        }

        System.out.println("The student with the highest total mark is " + students[ind] + " with and average mark of " + (double) Math.round(((max/120.0)*100) * 10d) / 10d + "%.");
    }
}
