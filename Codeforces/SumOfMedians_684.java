import java.io.*;
import java.util.*;


public class SumOfMedians_684 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int t, n, i, j;
        String s;

        t = sc.nextInt();
        while (t-->0) {
            n = sc.nextInt();
            int k= sc.nextInt();
            int arr[] = sc.readArray(k*n);
            int mid=(int)Math.ceil(n/2.0);
            long sum=0;
            if (n==2){
                for (i = 0; i < k*n; i+=2)
                      sum+=arr[i];
            }
            else {
                j = k*(mid-1);
                int ele = n-(mid-1);
                for (i = j; i <k*n ; i+=ele)
                    sum+=arr[i];
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


//
//if (k==1){
//        out.println(arr[mid-1]);
//        }
//        else {
//        if (mid == 1) {
//        i = 0;
//        while (k-- > 0) {
//        sum += arr[i];
//        i += n;
//        }
//        out.println(sum);
//        } else {
//        i = k * n - (n - 1);
//        while (k-- > 0) {
//        sum += arr[i];
//        i -= (n - 1);
//        }
//        out.println(sum);
//        }
//        }

// if (mid==1){
//         for (i = 0; i < k*n; i+=2) {
//        sum+=arr[i];
//        }
//        out.println(sum);
//        }
//        else {
//        int temp = 0;
//        int te = k * n - (n - 1);
//        while (k-- > 0) {
//        List<Integer> list = new ArrayList<>();
//        list.add(arr[temp]);
//        for (i = te; i < te + (n - 1); i++)
//        list.add(arr[i]);
//        sum += list.get(mid - 1);
//        te = te - (n - 1);
//        temp++;
//        }
//        out.println(sum);
//        }