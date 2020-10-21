import java.io.*;
import java.util.*;


public class DominantPirhana_677 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j,k;
        String s;

        t = sc.nextInt();
        while(t-->0) {
            n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[]=Arrays.copyOf(arr,n);
            sc.sort(b);
            int max=b[n-1];
            int flag=0;
            for (i = 0; i < n-1; i++) {
                if (arr[i] != arr[i + 1]) {
                    flag = 1;
                    break;
                }
            }
            if (flag==1){
                for (i = 0; i < n; i++) {
                    if(arr[i]==max && i>0 && i!=n-1){
                        if (arr[i-1]!=max || arr[i+1]!=max) {
                            out.println(i + 1);
                            break;
                        }
                    }
                    else if (arr[i]==max && i==0 && arr[i+1]!=max) {
                        out.println(1);
                        break;
                    }
                    else if (arr[i]==max && i==n-1) {
                        out.println(n);
                        break;
                    }
                }
            }
            else
            out.println(-1);
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