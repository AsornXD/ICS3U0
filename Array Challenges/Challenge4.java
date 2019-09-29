//Made by Askari Abbas
// ICS3U0
public class Challenge4 {
    public static void main(String[] args) {
        int[] diceRolls = new int[30];
        int[] outcomes = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 30; i++){
            int dice1 = (int)(Math.random() * (6-1) + 1) + 1;
            int dice2 = (int)(Math.random() * (6-1) + 1) + 1;
            int dice3 = (int)(Math.random() * (6-1) + 1) + 1;
            System.out.println(dice1 + " " + dice2 + " " + dice3);
            diceRolls[i] = dice1+dice2+dice3;
        }
        for (int i = 0; i < 30; i++){
            outcomes[diceRolls[i]-3]++;
        }
        for (int i = 0; i < 16; i++){
            System.out.println("Occurences for " + (i+3) + ": " + outcomes[i]);
        }
    }
}
