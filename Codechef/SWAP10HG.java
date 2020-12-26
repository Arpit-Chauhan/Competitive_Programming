import java.io.*;
import java.util.*;


public class SWAP10HG {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, n, i, j;
        String s;

        tc = sc.nextInt();
        while (tc-- > 0) {
            n = sc.nextInt();
            s= sc.nextLine();
            String p=sc.nextLine();
            int count0s=0,count0p=0,count1s=0,count1p=0;
            for (i = 0; i < n; i++) {
                char k=s.charAt(i);
                if (k=='1')
                    count1s++;
                else
                    count0s++;
            }
            for (i = 0; i < n; i++) {
                char k=p.charAt(i);
                if (k=='1')
                    count1p++;
                else
                    count0p++;
            }
            if (count0s!=count0p || count1s!=count1p)
                out.println("No");
            else {
                int count=0;
                boolean flag=false;
                for (i = 0; i < n; i++) {
                    char k=p.charAt(i);
                    char q=s.charAt(i);
                    if (k=='0' && q=='1')
                        count++;
                    else if (k=='1' && q=='0'){
                            count--;
                        if (count<0) {
                            flag=true;
                            break;
                        }
                    }
                }
                if (!flag)
                    out.println("Yes");
                else
                    out.println("No");
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