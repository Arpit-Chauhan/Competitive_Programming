import java.io.*;
import java.util.*;


public class IQ_Test {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;
        char arr[][]=new char[4][4];

        for (i = 0; i <4 ; i++)
            arr[i]=sc.nextLine().toCharArray();

        int flag=0;

        for (i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                int count=0;
                if (arr[i][j]=='#')
                    count++;
                if (arr[i][j+1]=='#')
                    count++;
                if (arr[i+1][j]=='#')
                    count++;
                if (arr[i+1][j+1]=='#')
                    count++;
                if (count!=2) {
                    flag = 1;
                    break;
                }
            }
            if (flag==1)
                break;
        }
        if (flag==1)
            out.println("YES");
        else
            out.println("NO");

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