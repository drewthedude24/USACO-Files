import java.util.*;
import java.io.*;
public class weirdAlg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.print(n + " ");
        while (n != 1){
            if (n%2 ==0){
                n/=2;
                System.out.print(n +  " ");
            } else{
                n = (n*3)+1;
                System.out.print(n + " ");
            }
        }
    }
}
