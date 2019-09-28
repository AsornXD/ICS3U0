//Made by Askari Abbas
// ICS3U0
public class Lvl3Q6 {
    public static void main(String[] args)
        {
            int count = 0;
            int dice1 = (int)(Math.random() * (6-1) + 1) + 1;
            int dice2 = (int)(Math.random() * (6-1) + 1) + 1;
            int dice3 = (int)(Math.random() * (6-1) + 1) + 1;
            System.out.println(dice1 + " " + dice2 + " " + dice3);
            while (dice1 + dice2 != dice3)
            {
                count+=1;
                dice1 = (int)(Math.random() * (6-1) + 1) + 1;
                dice2 = (int)(Math.random() * (6-1) + 1) + 1;
                dice3 = (int)(Math.random() * (6-1) + 1) + 1;
                System.out.println(dice1 + " " + dice2 + " " + dice3);
            }
            System.out.println(count);

        }
}
