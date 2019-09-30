//Made by Askari Abbas
// ICS3U0
import java.util.*;
public class Challenge5 {
    public static void main(String[] args) {
        ArrayList<Integer> rnums = new ArrayList<Integer>();
        int sum = 0;
        int iter = 0;
        System.out.println("Random numbers: ");
        while (sum <= 100){
            rnums.add((int)(Math.random() * (9-1) + 1) + 1);
            sum+=rnums.get(iter);
            System.out.println(rnums.get(iter));
            iter++;
        }
        System.out.println("It took " + iter + " iterations to get a sum above 100.");
        int even = 0;
        System.out.println("Even numbers:");
        for (int i = 0; i < rnums.size(); i++){
            if (rnums.get(i) % 2 == 0){
                System.out.println(rnums.get(i));
                even++;
            }
        }
        int odd = rnums.size() - even;
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
