import java.io.*;
import java.util.*;


public class Barrels_Edu96 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,k;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            k=sc.nextInt();
            int arr[] = sc.readArray(n);
            sc.sort(arr);
            long sum=arr[n-1];
                for (i = n-2; i >= 0; i--) {
                    if(k>0)
                     sum+=arr[i];
                    else if(k==0)
                        break;
                    k--;
                }
            out.println(sum);
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
         void sort(int arr[]){
            ArrayList<Integer> l=new ArrayList<>();
            for (int i: arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i]=l.get(i);
        }
    }
}