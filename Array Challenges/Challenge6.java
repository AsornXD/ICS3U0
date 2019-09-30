import java.util.*;
public class Challenge6 {
    public static void main(String[] args) {
        ArrayList<Integer> rnums = new ArrayList<Integer>();
        System.out.println("Numbers forward:");
        while (true){
            int random = (int)(Math.random() * (50+50) - 50) + 1;
            rnums.add(random);
            System.out.println(random);
            if (random < -45){
                break;
            }
        }
        System.out.println("Numbers backwards");
        int L = rnums.size();
        for (int i = L -1; i >= 0; i--){
            System.out.println(rnums.get(i));
        }
        System.out.println("Numbers that are multiples of 11: ");
        for (int i = L-1; i >= 0; i--){
            if (rnums.get(i) % 11 == 0){
                System.out.println(rnums.get(i));
            }
        }
    }
}
