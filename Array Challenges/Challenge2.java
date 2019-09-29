//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sales;
        System.out.println("Enter the sales for each month of the year (January - December):");
        sales = new int[] {Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine()),Integer.parseInt(input.nextLine())};
        int totalSales = 0;
        for (int i = 0; i < 12; i++){
            totalSales+=sales[i];
        }
        System.out.println("The total sales were " + totalSales + " units.");
        System.out.println("Sales have grown by " + (sales[11] - sales[0]) + " units over the year.");
    }
}
