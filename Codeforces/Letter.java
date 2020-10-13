import java.io.*;
import java.util.*;


public class Letter {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,flag=0;
        String s,s2;

        s= sc.nextLine();
        s2= sc.nextLine();
        int scap[] = new int[26];
        int ssma[] = new int[26];
        int s2cap[] = new int[26];
        int s2sma[] = new int[26];
        for (i = 0; i <s.length() ; i++) {
            int p=s.charAt(i);
            if (p>=65 && p<=90)
                scap[p-'A']++;
            if (p>=97 && p<=122)
                ssma[p-'a']++;
        }
        for (i = 0; i <s2.length() ; i++) {
            int p=s2.charAt(i);
            if (p>=65 && p<=90)
                s2cap[p-'A']++;
            if (p>=97 && p<=122)
                s2sma[p-'a']++;
        }
        for (i = 0; i < 26; i++) {
            if ((scap[i]<s2cap[i]) || (ssma[i]<s2sma[i])) {
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

        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }
    }
}