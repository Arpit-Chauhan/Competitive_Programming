import java.io.*;
import java.util.*;


public class CaesarCipher {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        n = sc.nextInt();
        s=sc.nextLine();
        int k= sc.nextInt();
        StringBuilder ans=new StringBuilder();

        int sma[]=new int[26];
        int cap[]=new int[26];
        for (i = 65; i <=90 ; i++)
            cap[i-65]=i;
        for (i = 97; i <=122 ; i++)
            sma[i-97]=i;


        for (i = 0; i < n; i++) {
            char p=s.charAt(i);
            if((p>=65 && p<=90) ||(p>=97 && p<=122)) {
                 if (Character.isLowerCase(p)) {
                    int temp = p;
                    int f=122-temp;
                    int index=25-f;
                    index = (index + k) %26;
                    ans.append((char) sma[index]);
                }
                 if (Character.isUpperCase(p)){
                     int temp = p;
                     int f=90-temp;
                     int index=25-f;
                     index = (index + k) %26;
                     ans.append((char) cap[index]);
                 }
            }
            else
                ans.append(p);
        }
        out.println(ans);

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