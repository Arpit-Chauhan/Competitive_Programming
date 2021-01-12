import java.io.*;
import java.util.*;


public class FAIRELCT {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            n = sc.nextInt();
            int m=sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[] = sc.readArray(m);
            long sumwin=0,sumlos=0;
            for (int item:arr)
                sumwin+=item;
            for (int item:b)
                sumlos+=item;
            Arrays.sort(arr);
            Arrays.sort(b);

            if (sumwin>sumlos)
                out.println(0);
            else {
                i=0;j=m-1;
                int count=0;
                boolean flag=false;
                while(i<n){
                    sumwin=sumwin-arr[i]+b[j];
                    sumlos=sumlos-b[j]+arr[i];
                    count++;
                    if (sumwin>sumlos){
                        flag=true;
                        break;
                    }
                    i++;j--;
                }
                if(!flag)
                    out.println(-1);
                else
                    out.println(count);
            }
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

        /*DEFINED BY ME*/

        //READING ARRAY
        int[] readArray(int n) {

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = nextInt();

            return arr;
        }

        //COLLECTIONS SORT
        void sort(int arr[]) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i : arr)
                l.add(i);
            Collections.sort(l);
            for (int i = 0; i < arr.length; i++)
                arr[i] = l.get(i);
        }

        //EUCLID'S GCD
        public static int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}