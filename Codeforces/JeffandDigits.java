import java.io.*;
import java.util.*;


public class JeffandDigits {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s="";

        n = sc.nextInt();
        int arr[] = new int[n];
        List<Integer> list5=new ArrayList<>();
        List<Integer> list0=new ArrayList<>();

        for (i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            if(arr[i]==5)
                list5.add(arr[i]);
            else
                list0.add(arr[i]);
        }
        if (list0.size()==0)
            out.println(-1);
        else if (list5.size()<9)
            out.println(0);
        else {
            int temp=list5.size()/9;
            for (j = 0; j <temp*9; j++)
                s=s+"5";
            out.print(s);
            for (j = 0; j <list0.size() ; j++)
                    out.print(0);
            out.println();
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
    }
}