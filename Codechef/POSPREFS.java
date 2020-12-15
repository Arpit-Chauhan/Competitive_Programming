/*
*
* WA
*
* */



import java.io.*;
import java.util.*;


public class POSPREFS {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            if (n%2==0){
                for (i = 1; i <=n; i++) {
                    if (i%2==0)
                    arr[i-1]=i;
                    else
                        arr[i-1]=-1*i;
                }
            }
            else{
                for (i = 1; i <=n; i++) {
                    if (i%2==0)
                        arr[i-1]=-1*i;
                    else
                        arr[i-1]=i;
                }
            }
            long sum=0,count=0;
            for (i = 0; i < n; i++) {
                sum+=arr[i];
                if (sum>0)
                    count++;
            }
            if (count>k){
                for (i = n-1; i>=0 ; i--) {
                    if (count==k)
                        break;
                    if (arr[i]>0) {
                        arr[i] = -1 * arr[i];
                        count--;
                    }
                }
            }
            if (count<k){
                for (i = n-1; i>=0 ; i--) {
                    if (count==k)
                        break;
                    if (arr[i]<0) {
                        arr[i] = -1 * arr[i];
                        count++;
                    }
                }
            }
            for (int item:arr)
                out.print(item+" ");

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