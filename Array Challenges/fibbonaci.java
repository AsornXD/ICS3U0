import java.util.*;
public class fibbonaci {
    private static Scanner in = new Scanner (System.in);
    private static int n = in.nextInt();
    private static long[] arr = new long[n+1];
    public static void main(String[] args) {
        for (int i = 0; i < n+1; i++){
            arr[i] = -1;
        }
        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fib(n));
    }
    private static long fib(int i){
        if (arr[i] != -1){
            return arr[i];
        }

        else{
            long curSum = fib(i-1) + fib(i - 2);
            arr[i] = curSum;
            return curSum;
        }
    }
}
