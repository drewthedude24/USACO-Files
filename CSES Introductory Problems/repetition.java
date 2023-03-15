import java.util.*;
import java.io.*;
public class repetition {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String dna = sc.nextLine();
        int ans = 1;
        int cnt = 1;
        for (int i = 1; i < dna.length();i++){
            if (dna.charAt(i) == dna.charAt(i-1)){
                cnt++;
                continue;
            }
            ans = Math.max(cnt, ans);
            cnt = 1;
        }
        ans = Math.max(1, Math.max(cnt,ans));
        System.out.println(ans);
    }
}
