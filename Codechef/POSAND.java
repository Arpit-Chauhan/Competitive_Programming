import java.io.*;
import java.util.*;


public class POSAND {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            if (n==1){
                out.println(1);
                continue;
            }
            else if (powerTo(n))
                out.println(-1);
            else{
                int arr[]=new int[n];
                for (i = 0; i < n; i++)
                    arr[i]=i+1;
                arr[0]=2;
                arr[1]=3;
                arr[2]=1;
                for (i = 3; i < n; i++) {
                    if(powerTo(i+1)){
                        int temp=arr[i+1];
                        arr[i+1]=arr[i];
                        arr[i]=temp;
                        i++;
                    }
                }
                for (i = 0; i < n; i++)
                    out.print(arr[i]+" ");
                out.println();
            }
        }
        out.close();
    }

    public static boolean powerTo(int n){
        if ((n&(n-1))==0)
            return true;
        else
            return false;
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