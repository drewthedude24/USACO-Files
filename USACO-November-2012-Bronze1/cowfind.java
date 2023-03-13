import java.util.*;
import java.io.*;
public class cowfind {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(new File("cowfind.in")));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowfind.out")));
        String t = br.readLine();
        int amount = 0;
        int backCount = 0;
        for (int i = 1; i < t.length(); i++){
            if (t.charAt(i-1) == '(' && t.charAt(i) == '(')
                backCount++;
                else if(t.charAt(i-1) == ')' && t.charAt(i) == ')')
                amount += backCount;
        }
    
        pw.print(amount);
        pw.close();
        br.close();     
    }
    }

