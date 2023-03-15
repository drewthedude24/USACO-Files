import java.util.*;
import java.io.*;

public class missingNum {
    public static void main(String args[])throws IOException{
        Scanner sc =new Scanner(System.in);
        long sum = 0;
        int n = sc.nextInt();
        long sum2 = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        for (int j = 0; j < n-1; j++){
            sum2 += sc.nextInt();
        }
        System.out.println(sum - sum2);
        sc.close();
    }
}
