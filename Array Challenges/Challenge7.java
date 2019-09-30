import java.util.ArrayList;
public class Challenge7 {
    public static void main(String[] args) {
        ArrayList<Integer> rnums = new ArrayList<Integer>();
        int sum = 0;
        int[] outcomes = new int[] {0,0,0,0,0,0,0,0};
        int iter = 0;
        System.out.println("Random numbers: ");
        while (sum <= 100){
            rnums.add((int)(Math.random() * (9-1) + 1) + 1);
            sum+=rnums.get(iter);
            System.out.println(rnums.get(iter));
            outcomes[rnums.get(iter)-2]++;
            iter++;
        }
        System.out.println("");
        for (int i = 0; i < 8; i++){
            System.out.println("Outcomes for " + (i + 2) + ": " + outcomes[i]);
        }
    }
}
