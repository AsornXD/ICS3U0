//Made by Askari Abbas
// ICS3U0
public class Lvl3Q9 {
    public static void main(String[] args) {
        int curPennyCounter = 1;
        int dayCounter = 0;
        int pennyCounter = 0;
        while(pennyCounter < 100000000)
        {
            curPennyCounter*=2;
            pennyCounter+=curPennyCounter;
            System.out.println(pennyCounter + " " + curPennyCounter);
            dayCounter++;
        }
        System.out.println("It will take you " + dayCounter + " days to get to 1 million dollars");
    }
}
