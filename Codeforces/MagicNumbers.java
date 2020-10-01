import java.io.*;
import java.util.*;


public class MagicNumbers {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        s=Integer.toString(n);
        int len=s.length();
        int flag=0;
        for (i = 0; i < len; i++) {
            char p=s.charAt(i);
            if(p=='1'){
                if(i<len-2){
                    char q=s.charAt(i+1);
                    char k=s.charAt(i+2);
                    if(q=='4' && k=='4') {
                        i += 2;
                        continue;
                    }
                }
                if (i<len-1){
                    char q=s.charAt(i+1);
                    if (q=='4')
                        i++;
                }
            }
            else{
                flag=1;
                break;
            }
        }
        if (flag==1)
            out.println("NO");
        else
            out.println("YES");

        out.close();
    }


    /*
		FASTREADER
	*/
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        /*DEFINED BY ME
         */
        int[] readArray(int n) {

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextInt();

            return arr;
        }
    }
}