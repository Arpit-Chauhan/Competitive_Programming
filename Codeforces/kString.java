import java.io.*;
import java.util.*;


public class kString {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int k, n, i, j;
        String s;
        StringBuilder str=new StringBuilder();
        n = sc.nextInt();
        s= sc.nextLine();
        int arr[]=new int[26];
        for (i = 0; i < s.length(); i++) {
            char p=s.charAt(i);
            arr[p-'a']++;
        }
        int flag=0;
        for (i = 0; i < 26; i++) {
            if (arr[i]%n!=0) {
                flag = 1;
                break;
            }
        }
        if (flag==1)
            out.println(-1);
        else {
                for (i = 0; i < 26; i++) {
                    for (j = 1; j <= arr[i] / n; j++)
                        str.append((char) (i + 97));
                }
                for (i = 0; i < n ; i++)
                    out.print(str);
        }

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