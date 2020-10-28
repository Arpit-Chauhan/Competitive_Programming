import java.io.*;
import java.util.*;


public class BoysandGirls {

    public static void main(String args[])throws IOException{

        Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter(new File("output.txt"));

        int t, n, i, j;
        StringBuilder s=new StringBuilder();

        n = sc.nextInt();
        int m = sc.nextInt();
        int k = 0;
        i = 0;
        j = 0;
        while (i < n && j < m) {
            if (k % 2 == 0) {
                s.append("B");
                k++;
                i++;
            } else {
                s.append("G");
                k++;
                j++;
            }
        }
        if (m>n){
            s.insert(0,"G");
            m--;
        }
        while (i < n){
            s.append("B");
            i++;
        }
        while (j < m) {
            s.append("G");
            j++;
        }
        out.println(s);
        out.close();
    }
}