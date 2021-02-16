import java.io.*;
import java.util.*;


public class BalancedRemainders_702 {

    public static void main(String args[]) {

        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int tc, i, j;
        String s;
        char p;

        tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int arr[] = sc.readArray(n);
            int b[]=Arrays.copyOf(arr,n);
            for (i = 0; i < n; i++)
                b[i]%=3;
            int ans[]=new int[3];
            for (i = 0; i < n; i++)
                ans[b[i]]++;

            int min=n/3;
            int count=0;
            if (ans[0]<min){
                if (ans[2] > min) {
                while(ans[0]!=min && ans[2]>min) {
                        ans[2]--;
                        count++;
                        ans[0]++;
                    }
                }
                if (ans[1] > min) {
                    while(ans[0]!=min && ans[1]>min) {
                        ans[1]--;
                        count+=2;
                        ans[0]++;
                    }
                }
            }
            if (ans[1]<min){
                if (ans[0] > min) {
                    while(ans[1]!=min  && ans[0]>min) {
                        ans[0]--;
                        count++;
                        ans[1]++;
                    }
                }
                if (ans[2] > min) {
                    while(ans[1]!=min && ans[2]>min) {
                        ans[2]--;
                        count+=2;
                        ans[1]++;
                    }
                }
            }
            if (ans[2]<min){
                if (ans[1] > min) {
                    while(ans[2]!=min && ans[1]>min) {
                        ans[1]--;
                        count++;
                        ans[2]++;
                    }
                }
                if (ans[0] > min) {
                    while(ans[2]!=min  && ans[0]>min) {
                        ans[0]--;
                        count+=2;
                        ans[2]++;
                    }
                }
            }

            out.println(count);
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
        int gcd(int a, int b) {
            if (b != 0)
                return gcd(b, a % b);
            else
                return a;
        }
    }
}