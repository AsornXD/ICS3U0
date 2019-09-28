public class Lvl3Q8 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int tempcounter = 0;
        int counter = 0;
        int prevsum = -1;
        while (tempcounter != 2)
        {
            num1 = (int)(Math.random() * (6-1) + 1) + 1;
            num2 = (int)(Math.random() * (6-1) + 1) + 1;

            if (num1 + num2 == prevsum)
            {
                tempcounter+=1;
            }
            else
            {
                tempcounter = 0;
                prevsum = num1+num2;
            }
            System.out.println(num1 + " " + num2);
            counter++;
        }
        System.out.println("It took " + counter + " rolls to get the same sum twice in a row.");
    }
}
